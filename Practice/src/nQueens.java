import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class nQueens {
    public List<List<String>> solveNQueens(int n) {
        List <List<String>> nQueens = new ArrayList<>();
        if (n == 1){
            List <String> temp = new ArrayList<>();
            temp.add ("Q");
            nQueens.add (new ArrayList(temp));
            return nQueens;
        }

        if (n == 2 || n == 3){
            return nQueens;
        }
        String[][] board = new String[n][n];

        for (int ind = 0; ind < board.length; ind++){
            Arrays.fill (board[ind],"");
        }

        for (int i = 0; i<n; i++){
            findNQueens (nQueens, board, n, 0, i);
        }
        
        return nQueens;

    }

    public void findNQueens (List <List<String>> nQueens, String[][] board, int n, int row, int col){

        if (row == n){
            nQueens.add (new ArrayList(Arrays.asList (board)));
            return;
        }

        for (int i=0; i < n; i++){
            if (checkIfPossible (board,row, i, n)){
                
                // If possible, placing the Queen
                board[row][i] = "Q";

                // Placing "." on the Queen's Path
                markPath (board,row, i, n);

                // Going to the next Row
                findNQueens (nQueens, board, n, row+1, 0);

                // Clearing the Board
                clearBoard(board, row, i, n);

                // Removing the Queen
                board[row][i] = "";
            }

        }
        
    }


    // Checking If placing the Queen is possible on a particular square
    public boolean checkIfPossible (String[][] board,int row, int col, int n){

        // Checking the row
        for (int i = 0; i < n; i++){
            if (i != col && board[row][i].equals(".")){
                return false;
            }
        }

        // Checking the column
        for (int i = 0; i < n; i++){
            if (i != row && board[i][col].equals(".")){
                return false;
            }
        }

        // Checking the Left Up diagonal
        int i = row;
        int j = col;
        while (i >= 0 && j >= 0){
            if (board[i][j].equals (".")){
                return false;
            }
            i--;
            j--;
        }

        // Checking the Left Down diagonal
        i = row;
        j = col;
        while (i < n && j >= 0){
            if (board[i][j].equals (".")){
                return false;
            }
            i++;
            j--;
        }

        // Checking the Right Up diagonal
        i = row;
        j = col;
        while (i >= 0 && j < n){
            if (board[i][j].equals (".")){
                return false;
            }
            i--;
            j++;
        }

        // Checking the Right Down diagonal
        i = row;
        j = col;
        while (i < n && j < n){
            if (board[i][j].equals (".")){
                return false;
            }
            i++;
            j++;
        }

        return true;
    }

    // Mrking the path of the Queen
    public void markPath (String[][] board,int row, int col, int n){
        
        System.out.println("Marking of "+row+" "+col);

        // Marking the row
        for (int i = 0; i < n; i++){
            if (i != col){
                System.out.println(row+" "+i);
                board[row][i] = ".";
            }
        }

        // Marking the column
        for (int i = 0; i < n; i++){
            if (i != row){
                System.out.println(i+" "+col);
                board[i][col] = ".";
            }
        }

        // Marking the Left Up diagonal
        int i = row;
        int j = col;
        while (i >= 0 && j >= 0){
            if (!board[i][j].equals("Q")){
                System.out.println(i+" "+j);
                board[i--][j--] = ".";
            }
        }

        // Marking the Left Down diagonal
        i = row;
        j = col;
        while (i < n && j >= 0){
            if (!board[i][j].equals("Q")){
                System.out.println(i+" "+j);
                board[i++][j--] = ".";
            }
        }

        // Marking the Right Up diagonal
        i = row-1;
        j = col+1;
        while (i >= 0 && j < n){
            System.out.println(i+" "+j);
            board[i--][j++] = ".";
        }

        // Marking the Right Down diagonal
        i = row+1;
        j = col+1;
        while (i < n && j < n){
            System.out.println(i+" "+j);
            board[i++][j++] = ".";
        }
    }

    // CClearing the board
    public void clearBoard (String[][] board,int row, int col, int n){
        
        // Clearing the row
        for (int i = 0; i < n; i++){
            if (i != col){
                board[row][i] = "";
            }
        }

        // Clearing the column
        for (int i = 0; i < n; i++){
            if (i != row){
                board[i][col] = "";
            }
        }

        // Clearing the Left Up diagonal
        int i = row;
        int j = col;
        while (i >= 0 && j >= 0){
            board[i][j] = "";
            i--;
            j--;
        }

        // Clearing the Left Down diagonal
        i = row;
        j = col;
        while (i < n && j >= 0){
            board[i][j] = "";
            i++;
            j--;
        }

        // Clearing the Right Up diagonal
        i = row;
        j = col;
        while (i >= 0 && j < n){
            board[i][j] = "";
            i--;
            j++;
        }

        // Clearing the Right Down diagonal
        i = row;
        j = col;
        while (i < n && j < n){
            board[i][j] = "";
            i++;
            j++;
        }
    }

    public static void main (String args[]){

        nQueens solution = new nQueens();
        List <List<String>> nQueenSol = new ArrayList<>();
        nQueenSol = solution.solveNQueens (4);

        for (List<String> list : nQueenSol){
            for (String s : list){
                System.out.println (s);
            }
        }
    }
}
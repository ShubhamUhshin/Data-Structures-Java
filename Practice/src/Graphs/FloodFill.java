package Graphs;

import java.util.ArrayDeque;
import java.util.Queue;

class FloodFill {

    private static class Pair {
        int first;
        int second;
        Pair(int f, int s) { this.first = f; this.second = s; }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

      //  int[][] visited = new int [image.length][image[0].length];
        int colourToChange = image[sr][sc];

    /*
        for (int i = 0; i<image.length; i++){
            for (int j=0; j<image[0].length;j++){
                visited[i][j] = image[i][j];
            }
        }

    */

        //for (int i=0 ;i < 2; i++){
            bfs (image,sr,sc,newColor,colourToChange);
        //}

        return image;

    }

    public void bfs (int[][] image, int sr, int sc, int newColor, int colourToChange){
        Queue<Pair> q = new ArrayDeque<Pair>();

        q.add (new Pair (sr,sc));

        while (!q.isEmpty()) {
            int first = q.peek().first;
            int second = q.peek().second;
            q.poll();

            if (image[first][second] == colourToChange) {
                image[first][second] = newColor;
            }

            if (first - 1 >= 0 && image[first - 1][second] == colourToChange) {
                q.add(new Pair(first - 1, second));
            }

            if (first + 1 < image.length && image[first + 1][second] == colourToChange) {
                q.add(new Pair(first + 1, second));
            }

            if (second - 1 >= 0 && image[first][second - 1] == colourToChange) {
                q.add(new Pair(first, second - 1));
            }

            if (second + 1 < image[0].length && image[first][second + 1] == colourToChange) {
                q.add(new Pair(first, second + 1));
            }
        }
    }

    public static void main(String[] args) {
        FloodFill fill = new FloodFill();
        int[][] image = new int[][]{
            {1,1,1},
            {1,1,0},
            {1,0,1}
        };
        int sr = 1, sc = 1, newColor = 2;
        int[][] res = fill.floodFill(image, sr, sc, newColor);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}

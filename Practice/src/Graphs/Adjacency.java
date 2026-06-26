package Graphs;
/*
 * Adjacency Class is to understand the code to create a adjacency matrix or graph.
 * An Adjacency list/matrix would store the neighbours of a particular node.
 * Generally, u and v are given, u is the number of nodes and v is the number of edges,
 * Or a pair of nodes is given in u and v which are adjacent or have an edge.
 * Let's asssume we have an input (1,2),(2,3), (3,4), (1,4), (4,5), (3,5)
 *  1 - 2
 *  |   |
 *  4 - 3
 *  |  /
 *  5
 *
 * So, for the unweighted graph, the adjacency matrix and list:
 * So, my adjacency matrix would look something like this :-
 *        1  2  3  4  5
 *      _________________
 *    1 | 0  1  0  1  0 |
 *    2 | 1  0  1  0  0 |
 *    3 | 0  1  0  1  1 |
 *    4 | 1  0  1  0  1 |
 *    5 | 0  0  1  1  0 |
 *      _________________
 *  This would take up roughly O(nxn) space.
 *
 * Another way to store this is using the adjacency list
 *  1 -> {2,4}
 *  2 -> {1,3}
 *  3 -> {2,4,5}
 *  4 -> {1,3,5}
 *  5 -> {3,4}
 *
 */
import java.util.ArrayList;

class Adjacency{

    public void adjacencyMatrixFillWithZero(int[][] undirectedGraphMatrix){
        for (int i=0;i<undirectedGraphMatrix.length;i++){
            for (int j=0;j<undirectedGraphMatrix.length;j++){
                undirectedGraphMatrix[i][j] = 0;
            }
        }
    }

    public void unweightedAdjacencyMatrix(int[][] undirectedGraphMatrix, int u, int v){
        undirectedGraphMatrix[u][v] = 1;
        undirectedGraphMatrix[v][u] = 1;
    }

    public void adjacencyListCreation(ArrayList<ArrayList<Integer>> undirectedGraphList){

        for (int i=0; i<11; i++){
            undirectedGraphList.add(new ArrayList<Integer>());
        }
    }

    public void unweightedAdjacencyList(ArrayList<ArrayList<Integer>> undirectedGraphList, int u, int v){
        undirectedGraphList.get(u).add(v);
        undirectedGraphList.get(v).add(u);
    }

    public void printUnweightedAdjacencyMatrix(int[][] undirectedGraphMatrix){
        for (int i=1;i<undirectedGraphMatrix.length;i++){
            System.out.print(i+": ");
            for (int j=0;j<undirectedGraphMatrix.length;j++){
                System.out.print (undirectedGraphMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void printUnweightedAdjacencyList(ArrayList<ArrayList<Integer>> undirectedGraphList){
        for (int i=1;i<undirectedGraphList.size();i++){
            System.out.print(i+": ");
            for (int j : undirectedGraphList.get(i)){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        

    }

    public static void main(String args[]){
        Adjacency adj = new Adjacency();
        int [][] undirectedGraphMatrix = new int [6][6];
        ArrayList<ArrayList<Integer>> undirectedGraphList = new ArrayList<ArrayList<Integer>>();
        adj.adjacencyMatrixFillWithZero(undirectedGraphMatrix);
        adj.unweightedAdjacencyMatrix(undirectedGraphMatrix,1,2);
        adj.unweightedAdjacencyMatrix(undirectedGraphMatrix,2,3);
        adj.unweightedAdjacencyMatrix(undirectedGraphMatrix,3,4);
        adj.unweightedAdjacencyMatrix(undirectedGraphMatrix,1,4);
        adj.unweightedAdjacencyMatrix(undirectedGraphMatrix,4,5);
        adj.unweightedAdjacencyMatrix(undirectedGraphMatrix,3,5);

        System.out.println("Adjacency Matrix:");
        System.out.println("-----------------");
        adj.printUnweightedAdjacencyMatrix(undirectedGraphMatrix);
        System.out.println("-----------------");

        adj.adjacencyListCreation(undirectedGraphList);

        adj.unweightedAdjacencyList(undirectedGraphList,1,2);
        adj.unweightedAdjacencyList(undirectedGraphList,2,3);
        adj.unweightedAdjacencyList(undirectedGraphList,3,4);
        adj.unweightedAdjacencyList(undirectedGraphList,1,4);
        adj.unweightedAdjacencyList(undirectedGraphList,4,5);
        adj.unweightedAdjacencyList(undirectedGraphList,3,5);

        System.out.println();
        System.out.println("Adjacency List:");
        System.out.println("-----------------");
        adj.printUnweightedAdjacencyList(undirectedGraphList);
        System.out.println("-----------------");

    }
}
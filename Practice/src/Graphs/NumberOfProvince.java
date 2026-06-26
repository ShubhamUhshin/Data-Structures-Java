package Graphs;

import java.util.ArrayList;
import java.util.Stack;

public class NumberOfProvince {

    public int numProvinces(int[][] adj) {

        ArrayList<Integer> answer = new ArrayList<>();
        int[] visited = new int[adj.length]; 

        Stack <Integer> neighbourCities = new Stack<>();

        for (int i=0; i<adj.length; i++){
                dfs (adj, i, visited, neighbourCities);
        }
        return 0;
        
    } 

        public void dfs (int[][] adjacencyList, int node, int[] visited, Stack<Integer> neighbourCities){

            
            }

        }

        

    public static void main (String args[]){

        

    }
    
}

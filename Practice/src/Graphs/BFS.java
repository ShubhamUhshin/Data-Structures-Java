package Graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class BFS{

	public void bfsTraversal (ArrayList<ArrayList<Integer>> adj, int node, int[] visited, ArrayList<Integer> bfsGraph){

		Queue<Integer> neighbourQueue= new ArrayDeque<>();

		neighbourQueue.add(node);
		visited[node] = 1;

		while (!neighbourQueue.isEmpty()){
			int currNode = neighbourQueue.poll();
			bfsGraph.add(currNode);
			for (int neighbour : adj.get(currNode)){
				if (visited[neighbour] == 0){
					neighbourQueue.add(neighbour);
					visited[neighbour] = 1;
				}
			}
		}

		for (int i : bfsGraph){

			System.out.println(i);
		}
	}

	public static void main(String args[]){

		Adjacency adjClass = new Adjacency();
		ArrayList<ArrayList<Integer>> undirectedGraphList = new ArrayList<ArrayList<Integer>>();

		adjClass.adjacencyListCreation(undirectedGraphList);


		adjClass.unweightedAdjacencyList(undirectedGraphList,1,2);
		adjClass.unweightedAdjacencyList(undirectedGraphList,2,3);
		adjClass.unweightedAdjacencyList(undirectedGraphList,3,4);
		adjClass.unweightedAdjacencyList(undirectedGraphList,4,5);
		adjClass.unweightedAdjacencyList(undirectedGraphList,4,6);
		adjClass.unweightedAdjacencyList(undirectedGraphList,3,7);
		adjClass.unweightedAdjacencyList(undirectedGraphList,3,7);
		adjClass.unweightedAdjacencyList(undirectedGraphList,3,8);
		adjClass.unweightedAdjacencyList(undirectedGraphList,2,10);
		adjClass.unweightedAdjacencyList(undirectedGraphList,1,9);


		int[] visited = new int [undirectedGraphList.size()+1];
		Arrays.fill(visited, 0);

		BFS bfs = new BFS();
		ArrayList <Integer> bfsGraph = new ArrayList<>();

		bfs.bfsTraversal(undirectedGraphList, 1, visited, bfsGraph);

	}
}
package Graphs;

import java.util.ArrayList;
import java.util.Arrays;

class DFS{
	/*
	public void dfsTraversal(ArrayList<ArrayList<Integer>> adj, int node){

		int [] isVisited = new int [adj.size()];
		Arrays.fill(isVisited, 0);
		Stack <Integer> adjacentElements = new Stack<Integer>();
		ArrayList <Integer> dfsGraph = new ArrayList<>();
		
		adjacentElements.add(node);
		while (!adjacentElements.isEmpty()){
			int rootNode = adjacentElements.pop();
			if (isVisited[rootNode] == 0){
				isVisited[rootNode] = 1;
				dfsGraph.add(rootNode);
				for (int nodeList : adj.get(rootNode)){
					adjacentElements.add(nodeList);
				}
			}
		}

		for (int i : dfsGraph){
			System.out.println("Element:" + i);
		}
	}

	*/

	public void dfsTraversal (ArrayList<ArrayList<Integer>> adj,int node, int[] visited, ArrayList<Integer> dfsGraph){
		visited[node] = 1;
		dfsGraph.add(node);
		for (int i : adj.get(node)){
			if (visited[i] == 0){
				dfsTraversal(adj, i, visited, dfsGraph);
			}
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

		DFS dfs = new DFS();
		// dfs.dfsTraversal(undirectedGraphList, 1);

		ArrayList <Integer> dfsGraph = new ArrayList<>();

		dfs.dfsTraversal(undirectedGraphList, 1, visited, dfsGraph);

		for (int i : dfsGraph){
			System.out.println(i);
		}

	}
}
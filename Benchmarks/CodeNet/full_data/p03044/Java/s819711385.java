import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

class Node {
	int id;

	Node(int id){
		this.id = id;
	}

	@Override
	public String toString() {
		return String.valueOf(id);
	}
}

class Edge {
	int node1ID;
	int node2ID;
	int cost;

	Edge(int node1ID, int node2ID, int cost){
		this.node1ID = node1ID;
		this.node2ID = node2ID;
		this.cost = cost;
	}

	boolean contains(int nodeID){
		return (node1ID == nodeID || node2ID == nodeID);
	}

	@Override
	public String toString() {
		return node1ID + "-" + node2ID;
	}
}

class Graph {
	ArrayList<Node> nodes = new ArrayList<Node>();
	ArrayList<Edge> edges = new ArrayList<Edge>();

	Graph(ArrayList<Node> nodes, ArrayList<Edge> edges){
		this.nodes = nodes;
		this.edges = edges;
	}

	Node getNode(int nodeID){
		Iterator<Node> iterator = nodes.iterator();
		while(iterator.hasNext()){
			Node node = iterator.next();
			if(node.id == nodeID)
				return node;
		}
		return null;
	}

	ArrayList<Edge> getAdjacentEdges(Node node){
		ArrayList<Edge> adjacentEdges = new ArrayList<Edge>();
		Iterator<Edge> iterator = edges.iterator();
		while(iterator.hasNext()){
			Edge edge = iterator.next();
			if(edge.contains(node.id))
				adjacentEdges.add(edge);
		}
		return adjacentEdges;
	}
}

public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
		int n = stdIn.nextInt();
		int[] u = new int[n-1];
		int[] v = new int[n-1];
		int[] w = new int[n-1];
		for(int i=0; i<n-1; i++){
			u[i] = stdIn.nextInt();
			v[i] = stdIn.nextInt();
			w[i] = stdIn.nextInt();
		}

		ArrayList<Node> nodes = new ArrayList<Node>();
		ArrayList<Edge> edges = new ArrayList<Edge>();
		for(int i=0; i<n; i++){
			nodes.add(new Node(i+1));
		}
		for(int i=0; i<n-1; i++){
			edges.add(new Edge(u[i], v[i], w[i]));
		}

		Graph graph = new Graph(nodes, edges);

		int [] color = new int[n];
		
		ArrayList<Node> openList = new ArrayList<Node>();
		ArrayList<Integer> visitedNodeIDs = new ArrayList<Integer>();
		Node s = graph.nodes.get(0);
		visitedNodeIDs.add(s.id);
		ArrayList<Edge> adjacentEdges = graph.getAdjacentEdges(s);
		Iterator<Edge> iterator = adjacentEdges.iterator();
		while(iterator.hasNext()){
			Edge edge = iterator.next();
			int adjacentNodeID = (edge.node1ID == s.id) ? edge.node2ID : edge.node1ID;
			color[adjacentNodeID-1] = 0;
			openList.add(graph.getNode(adjacentNodeID));
		}

		while(!openList.isEmpty()){
			s = openList.remove(0);
			visitedNodeIDs.add(s.id);
			adjacentEdges = graph.getAdjacentEdges(s);
			iterator = adjacentEdges.iterator();
			while(iterator.hasNext()){
				Edge edge = iterator.next();
				int adjacentNodeID = (edge.node1ID == s.id) ? edge.node2ID : edge.node1ID;
				if(!visitedNodeIDs.contains(adjacentNodeID)){
					if(edge.cost % 2 == 0){
						color[adjacentNodeID-1] = color[s.id-1];
					}else{
						color[adjacentNodeID-1] = 1 - color[s.id-1];
					}
					openList.add(graph.getNode(adjacentNodeID));
				}
			}
		}

		for(int i=0; i<n; i++){
			System.out.println(color[i]);
		}
	}
}


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int N = Integer.parseInt(scan.next());
	int M = Integer.parseInt(scan.next());

	Map<Integer, Node> nodes = new HashMap<Integer, Node>();
	nodes.put(1, new Node(0));
	for (int i = 2; i <= N; i++) {
	    nodes.put(i, new Node(Integer.MAX_VALUE));
	}

	List<Edge> edges = new ArrayList<Edge>(M);
	for (int i = 0; i < M; i++) {
	    int a = Integer.parseInt(scan.next());
	    int b = Integer.parseInt(scan.next());
	    int c = Integer.parseInt(scan.next());

	    edges.add(new Edge(nodes.get(a), nodes.get(b), -c));
	}

	for (int i = 0; i < N-1; i++) {
	    for(Edge edge: edges) {
		Node s = edge.source;
		Node d = edge.destination;
		long tmp = s.distance + edge.weight;
		d.distance = tmp < d.distance ? (int)tmp : d.distance;
	    }
	}
	String ans = String.valueOf(-nodes.get(N).distance);

	for(Edge edge: edges) {
	    Node s = edge.source;
	    Node d = edge.destination;
	    if(s.distance + edge.weight < d.distance) {
		ans = "inf";
		break;
	    }
	}
	
	System.out.println(ans);
	scan.close();
    }
}

class Node {
    int distance;

    Node(int d) {
	distance = d;
    }
}

class Edge {
    Node source;
    Node destination;
    int weight;

    Edge(Node s, Node d, int w) {
	source = s;
	destination = d;
	weight = w;
    }
}

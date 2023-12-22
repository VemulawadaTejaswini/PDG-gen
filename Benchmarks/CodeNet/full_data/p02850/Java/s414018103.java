
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] tmpArray;
		Node nodes[] = new Node[n];
		for(int i = 0; i < n; i++) {
			nodes[i] = new Node();
		}
		
		Edge[] edges = new Edge[n - 1];
		for(int i = 0; i < n - 1; i++) {
			tmpArray = br.readLine().split(" ");
			int start = Integer.parseInt(tmpArray[0]) - 1;
			int end = Integer.parseInt(tmpArray[1]) - 1;
			
			edges[i] = new Edge(start, end);
			
			nodes[start].edges.add(edges[i]);
			nodes[end].edges.add(edges[i]);
		}
	
		int maxIndex = 0;
		int maxColors = 0;
		
		for(int i = 0; i < n; i++) {
			if(maxColors < nodes[i].edges.size()) {
				maxColors = nodes[i].edges.size();
				maxIndex = i;
			}
		}
		
		System.out.println(maxColors);
		
		//BFS
		ArrayList<Node> queue = new ArrayList<Node>();
		queue.add(nodes[maxIndex]);
		nodes[maxIndex].visit = true;
		
		while(!queue.isEmpty()) {
			Node v = queue.remove(0);
			
			//coloring
			int prevColor = 0;
			for(int i = 0; i < v.edges.size(); i++) {
				Edge target = v.edges.get(i);
				
				if(target.color == -1) {
					for(int j = prevColor + 1; j <= maxColors; j++) {
						if(!v.usedColors.contains(j)) {
							target.color = j;
							nodes[target.start].usedColors.add(j);
							nodes[target.end].usedColors.add(j);
							prevColor = j;
							break;
						}
					}
				}
				
				if(!nodes[target.start].visit) {
					nodes[target.start].visit = true;
					queue.add(nodes[target.start]);
				}
				if(!nodes[target.end].visit) {
					nodes[target.end].visit = true;
					queue.add(nodes[target.end]);
				}

			}
			
			
		}
		
		for(int i = 0; i < n - 1; i++) {
			if(edges[i].color > maxColors || edges[i].color <= 0) {
				System.out.println("ERROR!!");
				System.exit(0);
			}
			System.out.println(edges[i].color);
		}
	}

}

class Node {
	Vector<Edge> edges = new Vector<Edge>();
	boolean visit = false;
	HashSet<Integer> usedColors = new HashSet<Integer>();

}
class Edge {
	int start;
	int end;
	int color;
	
	Edge(int start, int end){
		this.start = start;
		this.end = end;
		this.color = -1;
	}
}
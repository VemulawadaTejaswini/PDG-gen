import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Nodes nodes = new Nodes(n);
		int[][] uvw = new int[n - 1][3];
		for(int i = 0; i < uvw.length; i++){
			for(int i2 = 0; i2 < 3; i2++){
				uvw[i][i2] = sc.nextInt();
			}
			nodes.buildBrunch(uvw[i][0], uvw[i][1], uvw[i][2]);
		}
		nodes.prepare();
		nodes.printAns();
	}
}
class Nodes{
	int num;
	Node[] nodes;
	int[] parents;
	int[] linkedNumber;
	int root;
	Boolean[] distArray;
	Nodes(int n){
		num = n;
		parents = new int[n];
		distArray = new Boolean[n];
		nodes = new Node[n];
		linkedNumber = new int[n];
		for(int i = 0; i < n; i++){
			nodes[i] = new Node(i);
		}
	}
	void buildBrunch(int u, int v, int w){
		nodes[u -1].buildBrunch(nodes[v - 1], w);
		nodes[v -1].buildBrunch(nodes[u - 1], w);
		linkedNumber[u - 1]++;
		linkedNumber[v - 1]++;
	}
	void prepare(){
		Queue<Integer> leafNode = new ArrayDeque<>();
		for(int i = 0; i < num; i++){
			int linked = linkedNumber[i];
			if(linked == 1){
				leafNode.add(i);
			}
		}
		while(true){
			Integer leaf = leafNode.poll();
			if(leaf == null){
				break;
			}
			for(int parent : nodes[leaf].brunches.keySet()) {
				parents[leaf] = parent;
				nodes[parent].brunches.remove(leaf);
				if (nodes[parent].brunches.keySet().size() == 1){
					leafNode.add(parent);
				}
				root = parent;
			}
		}
		
	}
	boolean getDist(int n){
		boolean distance;
		if(n == root){
			return false;
		}else{
			if(distArray[n] == null){
				for(int key : nodes[n].brunches.keySet()){
					distance = nodes[n].brunches.get(key) ^ getDist(key);
					distArray[n] = distance;
					return distance;
				}
			}else{
				return distArray[n];
			}
		}
		return false;
	}
	void printAns(){
		for(int i = 0; i < num; i++){
			char c = getDist(i) ? '1' : '0';
			System.out.println(c);
		}
	}
}
class Node{
	int num;
	Map <Integer, Boolean>brunches = new HashMap<>();
	Node(int n){
		num = n;
	}
	void buildBrunch(Node node, int w){
		brunches.put(node.num, (w % 2 == 1) ? true : false);
	}
}
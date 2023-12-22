import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	
	static class Node {
        private int value;
        private final List<Node> relatedNodeList = new ArrayList<>();
 
        void addValue(final int value) {
            this.value += value;
        }
 
        int getValue() {
            return value;
        }
 
        void addRelation(final Node node) {
            relatedNodeList.add(node);
        }
 
        List<Node> getRelatedNodeList() {
            return relatedNodeList;
        }
    }
	
	
	
	
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		Node[] nodes = new Node[N];

		for(int i=0; i < nodes.length; i++) {
			nodes[i]=new Node();
		}
		//nodeに辺を追加
		for(int i=0; i<N-1;i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			
			nodes[a].addRelation(nodes[b]);
			nodes[b].addRelation(nodes[a]);
		}
		for(int i=0; i<Q; i++) {
			int node = sc.nextInt()-1;
			int operation = sc.nextInt();
			nodes[node].addValue(operation);
		}
		
		recursive(nodes[0],null);
		
		for(final Node node : nodes) {
			System.out.print(node.getValue()+" ");
		}
		
	}
		private static void recursive(final Node node, final Node parent) {
			for(final Node relatedNode:node.getRelatedNodeList()) {
				if(relatedNode == parent) {
					continue;
				}
				relatedNode.addValue(node.getValue());
				recursive(relatedNode,node);
			}
		}
		
	
}	
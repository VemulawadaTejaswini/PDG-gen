import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static boolean debug = true;

    public static class Node {
    	Node parent = null;
    	List<Node> children = new LinkedList<Node>();
    	boolean visited = false;
    	long v = 0;

    	public boolean hasParent() {
    		return !(parent == null);
    	}

    	public void setParent(Node p) {
    		this.parent = p;
    	}

    	public void addChild(Node n) {
    		this.children.add(n);
    		n.setParent(this);
    	}

    	public void addValue(long v) {
    		this.v += v;
    	}

    	public long getValue() {
    		return this.v;
    	}

    	public void calc(long parentValue) {
    		if (visited) {
    			return;

    		} else {
	    		this.v += parentValue;

	    		for(Node child : children) {
	    			child.calc(this.v);
	    		}

	    		visited = true;
    		}
    	}

    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

       	int n = sc.nextInt();
        int q = sc.nextInt();

        // Node番号から直接Nodeを取れるインデックスを生成しとく
        Node[] nodes = new Node[n];

        for(int i=0; i < n; i++){
        	nodes[i] = new Node();
        }

        // 親子関係をグラフに保存
        for(int i=0; i < n - 1; i++){
            int p = sc.nextInt();
            int c = sc.nextInt();

            Node n1 = nodes[p - 1];
            Node n2 = nodes[c - 1];

            if (n1.hasParent()) {
            	 if (n2.hasParent()) {
            		 // 取り合えず左辺を親にしてみる（）
            		 n1.addChild(n2);
//            		 throw new RuntimeException("両方親もってるとかエラー");
            	 } else {
            		 n1.addChild(n2);
            	 }
            } else {
            	if (n2.hasParent()){
            		n2.addChild(n1);
            	} else {
            		// どっちも親持ってなかったら取り合えず左側を親とするにゃ
            		n1.addChild(n2);
            	}
            }
        }

        // 一旦全ての操作の値を各Nodeに保存（子に対する計算はしない）
        for(int i = 0; i < q; i++){
            int key = sc.nextInt();
            long value = sc.nextLong();

            nodes[key - 1].addValue(value);
        }

        // グラフをたどって部分木の値を計算
        nodes[0].calc(0);

        StringBuilder sb = new StringBuilder();

        // 出力してみる
        for(Node node : nodes){
            sb.append(node.getValue());
            sb.append(' ');
        }

        System.out.println(sb.toString());
    }

    public static void d(String message){
        if(debug){
            System.out.println(message);
        }
    }
}
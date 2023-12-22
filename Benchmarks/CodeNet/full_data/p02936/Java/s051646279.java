import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static boolean debug = true;

    public static class Node {
    	List<Node> children = new LinkedList<Node>();
    	long v = 0;

    	public void addChild(Node n) {
    		this.children.add(n);
    	}

    	public void addValue(long v) {
    		this.v += v;
    	}

    	public long getValue() {
    		return this.v;
    	}

    	public void calc(long parentValue) {
    		this.v += parentValue;

    		for(Node child : children) {
    			child.calc(this.v);
    		}
    	}

    }
	static String input = "4 3\r\n" +
			"1 2\r\n" +
			"2 3\r\n" +
			"2 4\r\n" +
			"2 10\r\n" +
			"1 100\r\n" +
			"3 1";
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
//    	Scanner sc = new Scanner(new ByteArrayInputStream(input.getBytes("utf-8")));

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

            if (p > c) {
            	int t = c;
            	c = p;
            	p = t;
            }

            nodes[p - 1].addChild(nodes[c - 1]);
        }

        // 一旦全ての操作の値を各Nodeに保存（子に対する計算はしない）
        for(int i = 0; i < q; i++){
            int key = sc.nextInt();
            long value = sc.nextLong();

            nodes[key - 1].addValue(value);
        }

        // グラフをたどって部分木の値を計算
        nodes[0].calc(0);

        // 出力してみる
        for(Node node : nodes){
            System.out.print(node.getValue() + " ");
        }
    }

    public static void d(String message){
        if(debug){
            System.out.println(message);
        }
    }
}
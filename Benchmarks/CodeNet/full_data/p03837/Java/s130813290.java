

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int N,M;
		N = Integer.parseInt(sc.next());
		M = Integer.parseInt(sc.next());
		Node[] V = new Node[N];
				
		for(int i=0;i<M;i++) {
			V[i] = new Node(i);
		}
		for(int i=0;i<M;i++) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			int c = Integer.parseInt(sc.next());
			Edge e = new Edge(V[a-1],V[b-1],c);
			V[a-1].edges.add(e);
		}
		List<Node> list = new ArrayList<Node>(Arrays.asList(V));
		Set<Edge> used = new HashSet<>();
		while(V.length>0){
			Node[] clone = V.clone();
			PFSearch dj = new PFSearch(clone);
			for(Node u : clone) {
				for(Node v : clone) {
					dj.solve(u,v);
					for(int i= 0;i<dj.getPath(v.id).length-1;i++){
						used.add(new Edge(dj.getPath(v.id)[i],dj.getPath(v.id)[i+1],1));
					}
					list.remove(u);
					V = list.toArray(new Node[list.size()]);
				}
			}
		}
		out.println(V.length);

		out.flush();
	}

	public static class Node implements Comparable {
	    int id;
	    double value;
	    Node via;
	    Vector<Edge> edges;
	    public Node(int id) {
		this.id = id;
		this.value = Double.MAX_VALUE;
		this.via = null;
		this.edges = new Vector<Edge>();
	    }
	    public int compareTo(Object o) {
		if (! (o instanceof Node)) throw new IllegalArgumentException("Node needed");
		Node x = (Node)o;
		return (this.value > x.value)? 1 :
		    ((this.value < x.value)? (-1) : 0);
	    }
	    public String toString() {
		return "node#"+id+"["+((via==null)? "null":via.id)+","+value+"]";
	    }
	    public static String toString(Node[] a) {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (int i=0; i<a.length; i++) sb.append(((i==0)?"":" ")+a[i]);
		sb.append("]");
		return sb.toString();
	    }
	}
	
	public static class Edge {
	    Node src;
	    Node dst;
	    double value;
	    public Edge(Node src,Node dst,double value) {
		this.src = src;
		this.dst = dst;
		this.value = value;
	    }
	    public String toString() {
		return "edge#"+value+"("+src+","+dst+")";
	    }
	    public static String toString(Vector<Edge> v) {
		return toString(v.toArray(new Edge[0]));
	    }
	    public static String toString(Edge[] a) {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (int i=0; i<a.length; i++) sb.append(a[i] + " ");
		sb.append("]");
		return sb.toString();
	    }
	}

	public static class PFSearch {
	    static Node[] nodes;
	    public PFSearch(Node[] nodes) {
		this.nodes = nodes;
	    }
	    public static void solve(Node src,Node dst) {
		// 未確定のノードを優先度キューで管理する
		PriorityQueue<Node> q = new PriorityQueue<Node>();
		// まず、全てのノードを未確定のノードとする。
		for (int i=0; i<nodes.length; i++) {
		    nodes[i].value = Double.MAX_VALUE;	// 距離の初期値は無限大
		    q.add(nodes[i]);
		}
		// 始点ノードの距離を0と設定して、未確定ノード群に入れる。
		q.remove(src);	// 未確定ノード群から始点ノードを一旦取り出して
		src.value = 0;	// 距離を0に書き換えて
		q.offer(src);	// 未確定ノード群に戻す
		while (q.size() > 0) {	// 未確定ノード群にノードがある限り繰り返す
		    Node x = q.poll();	// 距離最小ノードを未確定ノード群から取り出す
		    if (x.value == Double.MAX_VALUE) return; // 非連結ノード
		    if (x == dst) return; // 目的地までの距離が確定したら終了する
		    // 取り出したノードに隣接するノードの距離を書き換える
		    for (Iterator<Edge> it=x.edges.iterator(); it.hasNext(); ) {
			Edge e = it.next(); // xにつながっているエッジ
			Node y = e.dst; // xに隣接しているノードをyとする
			double newValue = x.value +e.value; // x経由でのyまでの距離
			if (newValue < y.value) { // 新しい経路の方が近ければ
			    if (q.remove(y)) { // 可能ならば未確定ノード群から取り除き
				y.value = newValue; // yの距離を変更してから
				y.via = x; // x経由と記録して
				q.offer(y);	// yを未確定ノード群に戻す
			    }
			}
		    }
		}
	    }
	    public Node[] getPath(int id) {
		Vector<Node> v = new Vector<Node>();
		for (Node node = nodes[id]; node != null; node=node.via) v.add(node);
		for (int i=0; i<v.size()/2; i++) { // 逆順なので順番を逆に戻す
		    int j=v.size()-1-i;
		    Node tmp=v.get(i);
		    v.set(i,v.get(j));
		    v.set(j,tmp);
		}
		return v.toArray(new Node[0]); // 配列に変換して返す
	    }
	    public String toString() {
		return Node.toString(nodes);
	    }
	}
}

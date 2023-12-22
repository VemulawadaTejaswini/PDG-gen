import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
 
 
public class Main {
	
	public static void main(String[] args) throws IOException {
		Main m = new Main();
		//*
		m.input();
		m.solve();
		m.output();
		/*/
		m.debug();
		//*/
	}
	
	public void debug() {
	}
	
	/*
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String S = null;
	/*/
	InputUtil in = new InputUtil();
	//*/
	PrintWriter out = new PrintWriter(System.out);
	int N = 0;
	int M = 0;
	Graph graph = new Graph();
	boolean ans = true;
	
	public void input() throws IOException {
		N = in.nextInt();
		M = in.nextInt();
		for (int i=0; i<M; i++) {
			graph.addNodeAndEdge(in.nextInt(), in.nextInt(), in.nextInt());
		}
	}
	
	public void solve() throws IOException {
		for (HashMap<Integer, Node> nodeMap: graph.nodeMapList) {
			for(Integer id: nodeMap.keySet()) {
				Node n = nodeMap.get(id);
				if (!n.setAndcheckPos(0)) {
					ans = false;
					return;
				}
				break;
			}
		}
	}
	
	public void output() {
		out.println(ans ? "Yes" : "No");
		out.flush();
	}
}



class Graph {
	ArrayList<HashMap<Integer, Node>> nodeMapList = new ArrayList<>();
	HashMap<Integer,Integer> nodeGraphMap= new HashMap<>();
	
	public void addNodeAndEdge(int lid, int rid, int dist) {
		Integer lgid = nodeGraphMap.get(lid);
		Integer rgid = nodeGraphMap.get(rid);
		int basegid;
		if (lgid == null && rgid == null) {
			basegid = addNewGraph();
		} else if (lgid != null && rgid != null) {
			if (lgid != rgid) {
				merge(lgid,rgid);
			}
			basegid = lgid;
		} else {
			basegid = (lgid == null) ? rgid : lgid;
		}
		addNodeAndEdgeSub(basegid, lid, rid, dist);
	}
	
	private void addNodeAndEdgeSub(int gid, int lid, int rid, int dist) {
		Node l = addNode(gid, lid);
		Node r = addNode(gid, rid);
		l.addEdge(r, dist);
		r.addEdge(l, -dist);
	}
	
	public void merge(int gid1, int gid2) {
		HashMap<Integer, Node> nodeMap1 = nodeMapList.get(gid1);
		HashMap<Integer, Node> nodeMap2 = nodeMapList.get(gid2);
		for(int gid2Node: nodeMap2.keySet()) {
			nodeGraphMap.put(gid2Node, gid1);
		}
		nodeMap1.putAll(nodeMap2);
	}
	
	public int addNewGraph() {
		HashMap<Integer, Node> nodeMap = new HashMap<>();
		int gid = nodeMapList.size();
		nodeMapList.add(nodeMap);
		return gid;
	}
	
	public Node addNode(int gid, int id) {
		HashMap<Integer,Node> nodeMap= nodeMapList.get(gid);
		Node n = null;
		if (!nodeMap.containsKey(id)) {
			nodeMap.put(id, n = new Node(id));
			nodeGraphMap.put(id, gid);
		} else {
			n = nodeMap.get(id);
		}
		return n;
	}

}

class Node {
	int id; 
	int pos = Integer.MIN_VALUE;
	HashSet<Edge> edgeSet = new HashSet<>();
	public Node(int id) {
		this.id=id;
	}
	
	public boolean setAndcheckPos(int pos) {
		this.pos=pos;
		for(Edge e: edgeSet) {
			Node n = e.getAnotherNode(this);
			if (n.pos == Integer.MIN_VALUE) {
				return n.setAndcheckPos(pos + e.dist);
			} else if (pos + e.dist != n.pos) {
				return false;
			}
		}
		return true;
	}
	
	public void addEdge(Node next, int dist) {
		Edge e;
		if (dist > 0) {
			e = new Edge(this, next, dist);
		} else {
			e = new Edge(next, this, dist);
		}
		edgeSet.add(e);
	}
	
}

class Edge {
	Node l;
	Node r;
	int dist;
	
	public Edge(Node l, Node r, int dist) {
		this.l=l;
		this.r=r;
		this.dist=dist;
	}
	
	public Node getAnotherNode(Node base) {
		if (base == null || l == null || r == null) {
			return null;
		}
		if (l.equals(base)) {
			return r;
		} else if (r.equals(base)) {
			return l;
		} else {
			return null;
		}
	}
}

//class Node implements Comparable<Node>{
//	int l = -1;
//	int r = -1;
//	int d = -1;
//	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + d;
//		result = prime * result + l;
//		result = prime * result + r;
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Node other = (Node) obj;
//		if (d != other.d)
//			return false;
//		if (l != other.l)
//			return false;
//		if (r != other.r)
//			return false;
//		return true;
//	}
//	@Override
//	public int compareTo(Node o) {
//		int ret = Integer.compare(l, o.l);
//		if (ret == 0) {
//			ret = Integer.compare(r, o.r);
//		}
//		if (ret == 0) {
//			ret = Integer.compare(d, o.d);
//		}
//		return ret;
//	}
//	
//	
//}

//*
class InputUtil {
	//Static Fields
	private static final int BUFSIZ = 100000;
	
	//Fields
	protected InputStream in;
	private byte[] buf = null;
	private int ptr = 0;
	private int max = -1;
	private DataInputStream dis = null;
	//Constructors
	public InputUtil() {this(System.in,BUFSIZ);}
	public InputUtil(InputStream in, int bufsiz) {
		initBuf(bufsiz);
		initIn(in);
	}
	
	//Methods
	//Initializer
	protected void initIn(InputStream in) {dis = new DataInputStream(this.in = in);}
	protected void initBuf(int bufsiz) {buf = new byte[bufsiz];}
	
	//buffer operation
	private void next() throws IOException {ptr++; readBuf();}
	private void readBuf() throws IOException {
		if(ptr >= max && dis.available()>0) {
			if(max>0) Arrays.fill(buf,0,max,(byte)0);
			max = dis.read(buf);
			ptr = 0;
		}
	}
	
	//Number Input Reader/Parser
	private boolean isNum(byte b) {return '0' <= b && b <= '9'; }
	private boolean isMinus(byte b) {return b=='-'; }
 
	private int _nextInt() throws IOException {
		int sign = 1;
		int res = 0;
		byte c;
		while (!isNum(c=buf[ptr]) && !isMinus(c)) 
			next();
		if (isMinus(buf[ptr])) {
			sign = -1;
			next();
		}
		while (isNum(c=buf[ptr])) {
			res *= 10;
			res += c - '0' ;
			next();
		}
		next();
		return sign * res;
	}
	
	public int nextInt() throws IOException {
		readBuf();
		return _nextInt();
	}
 
	public int[] nextInt(int[] result) throws IOException {
		readBuf();
		for(int i=0; i<result.length; i++) {
			result[i] = _nextInt();
		}
		return result;
	}
	
	//Close 
	public void close() throws IOException {
		if(!this.in.equals(System.in)) 
			this.in.close();
	}
}
//*/

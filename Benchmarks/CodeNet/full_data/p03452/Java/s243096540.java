import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
 
 
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
	int[] L = null;
	int[] R = null;
	int[] D = null;
	int[] X = null;
	Map<Integer, Set<Node>> nodeMap = new HashMap<>();
	boolean[] Xfin = null;
	boolean ans = true;
	boolean searchEnd = false;
	
	public void input() throws IOException {
		N = in.nextInt();
		M = in.nextInt();
		L = new int[M];
		R = new int[M];
		D = new int[M];
		X = new int[N+1];
		Xfin = new boolean[N+1];
		for (int i=0; i<M; i++) {
			L[i] = in.nextInt();
			R[i] = in.nextInt();
			D[i] = in.nextInt();
			addNode(L[i], new Node(R[i], D[i]));
			addNode(R[i], new Node(L[i], -D[i]));
		}
		Arrays.fill(X, Integer.MIN_VALUE);
	}
	
	private void addNode(int node, Node newNode) {
		Set<Node> nodeSet = nodeMap.get(node);
		if (nodeSet == null) {
			nodeSet = new HashSet<>();
			nodeMap.put(node, nodeSet);
		}
		nodeSet.add(newNode);
	}
	
	public void solve() throws IOException {
		for (Integer idx: nodeMap.keySet()) {
			if (!Xfin[idx]) {
				List<Integer> searchNode = new LinkedList<>();
				searchNode.add(idx);
				while(!searchEnd && searchNode != null && !searchNode.isEmpty()) {
					searchNode = solveSub(searchNode);
				}
			}
		}
		
	}
	
	private List<Integer> solveSub(List<Integer> searchNode) {
		List<Integer> nextSearchNode = new LinkedList<>();
		for (int i : searchNode) {
			if (X[i] == Integer.MIN_VALUE) {
				X[i] = 0;
			}
			for (Node node : nodeMap.get(i)) {
				if (!Xfin[node.targetNodeId]) {
					if (X[node.targetNodeId] == Integer.MIN_VALUE) {
						X[node.targetNodeId] = X[i] + node.targetDist;
					} else if (X[node.targetNodeId] != X[i] + node.targetDist ) {
						ans = false;
						searchEnd = false;
						return null;
					}
					nextSearchNode.add(node.targetNodeId);
				}
			}
			Xfin[i] = true;
		}
		return nextSearchNode;
	}
	
	public void output() {
		out.println(ans ? "Yes" : "No");
		out.flush();
	}
}

class Node {
	int targetNodeId = -1;
	int targetDist = Integer.MIN_VALUE;
	public Node(int targetNodeId, int targetDist) {
		this.targetNodeId = targetNodeId;
		this.targetDist = targetDist;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + targetDist;
		result = prime * result + targetNodeId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (targetDist != other.targetDist)
			return false;
		if (targetNodeId != other.targetNodeId)
			return false;
		return true;
	}
	
	public String toString() {
		return "id="+targetNodeId+",dist="+targetDist;
	}
	
}

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

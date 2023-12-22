import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;


/**
 * --------------------------------------------------
 * Main Class
 * --------------------------------------------------
 */
public class Main {

	NodeUtil<State> nodeUtil = null;
	DualList<Node<State>> snukeNodes = new DualList<>();
	DualList<Node<State>> fennecNodes = new DualList<>();
	DualList<Node<State>> tempNodes = new DualList<>();

	public void exec() throws IOException {
		InputUtil input = new InputUtil();
		PrintWriter out = new PrintWriter(System.out);
		int N = input.nextInt();
		nodeUtil = new NodeUtil<>(N);
		
		State[] v = new State[N];
		v[0] = State.BLACK_FENNEC;
		Arrays.fill(v,1,N-1,State.NON);
		v[N-1] = State.WHITE_SNUKE;
		nodeUtil.initNodeValue(v);

		int[] a = new int[N-1];
		int[] b = new int[N-1];
		for (int i=0; i<N-1; i++) {
			a[i] = input.nextInt()-1;
			b[i] = input.nextInt()-1;
		}
		nodeUtil.initPath(a, b);
		
		fennecNodes.add(nodeUtil.nodeList.get(0));
		snukeNodes.add(nodeUtil.nodeList.get(N-1));
		
		while(fennecNodes.count + snukeNodes.count < N){
			fillNode(fennecNodes, State.BLACK_FENNEC);
			fillNode(snukeNodes, State.WHITE_SNUKE);
		}
		out.println((fennecNodes.count <= snukeNodes.count)?"Snuke":"Fennec");
		out.flush();
		input.close();
	}
	
	private void fillNode(DualList<Node<State>> list, State state) {
		while(list.hasNext()) {
			Node<State> node = list.next();
			for (Node<State> rinsetuNode : node.edges ){
				if(rinsetuNode.value == State.NON){
					rinsetuNode.value = state;
					tempNodes.add(rinsetuNode);
				}
			}
		}
		if(!tempNodes.isEmpty()){
			list.add(tempNodes);
			tempNodes.clear();
		}
		
	}

	public static void main(String[] args) throws IOException {
		new Main().exec();
	}

	enum State {NON,BLACK_FENNEC,WHITE_SNUKE}
	

}
/**
 * --------------------------------------------------
 * Node
 * --------------------------------------------------
 */

class NodeUtil<T> {
	public List<Node<T>> nodeList = null;
	public NodeUtil(int capacity){
		nodeList = new ArrayList<>(capacity);
	}

	public void initNodeValue(T[] values) {
		for(int i=0; i<values.length; i++){
			nodeList.add(i,new Node<T>(i,values[i]));
		}
	}
	public void initPath(int[] pathA, int[] pathB) {
		if(pathA.length != pathB.length) 
			throw new IllegalArgumentException("different array length :pathA, pathB");
		
		for(int i=0; i<pathA.length; i++){
			nodeList.get(pathA[i]).link(nodeList.get(pathB[i]));
		}
		
	}
}

class Node<T> {
	int index = -1;
	T value = null;
	LinkedList<Node<T>> edges = new LinkedList<>();
	
	public Node(int idx, T val){
		index = idx;
		value = val;
	}
	
	public void link(Node<T> n) {
		this.edges.add(n);
		n.edges.add(this);
	}
	
}

/**
 * --------------------------------------------------
 * DualList
 * --------------------------------------------------
 */
class DualList<T> implements Iterable<T>, Iterator<T> {
	static class Node<T> {
		public DualList.Node<T> prev = null;
		public DualList.Node<T> next = null;
		public T value = null;
		public boolean setNext(T val) {
			next = new Node<T>();
			next.value = val;
			next.prev = this;
			return true;
		}
		public boolean setPrev(T val) {
			prev = new Node<T>();
			prev.value = val;
			prev.next = this;
			return true;
		}
	}
	long count = 0;
	private Node<T> head = null;
	private Node<T> tail = null;
	private Node<T> search = null;

	public boolean isEmpty() {
		return head==null;
	}
	public void add(DualList<T> list) {
		tail.next = list.head;
		list.head.prev = tail;
		tail = list.tail;
		if(!hasNext()){
			search=list.head;
		}
		count += list.count;
	}
	public void add(T value){
		if(isEmpty()){
			search = head = tail = new Node<T>();
			head.value = value;
		}else{
			tail.setNext(value);
			tail = tail.next;
		}
		count++;
	}
	public void clear() {
		head = tail = search = null;
		count = 0;
	}
	public void resetSearch() { 
		search = head;
	}
	@Override
	public Iterator<T> iterator() {
		return this;
	}
	@Override
	public boolean hasNext() {
		return search != null;
	}
	@Override
	public T next() { 
		if(!hasNext()) {
			throw new NoSuchElementException();
		}else{
			T ret = search.value; 
			search = search.next;
			return ret;
		}
	}
	
}

/**
 * --------------------------------------------------
 * Input Utility
 * --------------------------------------------------
 */
class InputUtil {
	//Static Fields
	private static final int BUFSIZ = 2200000;
	
	//Fields
	protected InputStream in;
	private char[] buf = null;
	private int ptr = 0;
	private int max = -1;
	private BufferedReader br = null;
	
	//Constructors
	public InputUtil() {this(System.in,BUFSIZ);}
	public InputUtil(int bufsiz) {this(System.in,bufsiz);}
	public InputUtil(InputStream in) {this(in,BUFSIZ);}
	public InputUtil(InputStream in, int bufsiz) {
		initBuf(bufsiz);
		initIn(in);
	}
	
	//Methods
	//Initializer
	protected void initIn(InputStream in) {br = new BufferedReader(new InputStreamReader(this.in = in));}
	protected void initBuf(int bufsiz) {buf = new char[bufsiz];}
	
	//String Input Reader/Parser
	private void readBuf() throws IOException {
		if(ptr >= max && br.ready()) {
			max = br.read(buf);
			ptr = 0;
		}
	}
	
	public BufferedReader getReader() {return br;}
	
	//Number Input Reader/Parser
	private boolean isNum(char b) {return '0' <= b && b <= '9'; }
	private boolean isMinus(char b) {return b=='-'; }
	private boolean isCrLf(char b) {return b == '\r' || b == '\n'; }
	private void next() throws IOException {ptr++; readBuf();}

	private void skipOneCrLf() throws IOException {
		char c = buf[ptr];
		if (isCrLf(c)) {
			ptr++;
			if (c == '\r') {
				readBuf();
				if (ptr < max && buf[ptr] == '\n') {
					ptr++;
				}
			}
		}
	}


	public String nextLine() throws IOException {
		StringBuilder sb = new StringBuilder();
		for(readBuf(); ptr < max ;readBuf()) {
			char c = buf[ptr];
			if(isCrLf(c)) {
				skipOneCrLf();
				break;
			}else{
				int strPtr = ptr++;
				int endPtr = -1;
				for(int i = ptr; i<max; i++) {
					if(isCrLf(buf[i])) {
						endPtr = i;
						break;
					}
				}
				if(endPtr == -1) endPtr = max;
				sb.append(String.valueOf(buf, strPtr, endPtr-strPtr)); 
				ptr = endPtr;
			}
		}
		return sb.toString();
	}
	
	public int nextInt() throws IOException {return nextInt(new int[1])[0];}
	public int[] nextInt(int[] result) throws IOException {
		readBuf();
		for(int i=0; i<result.length; i++) {
			int sign = 1;
			int res = 0;
			char c;
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
			result[i] = sign * res;
		}
		return result;
	}
	
	//Close 
	public void close() throws IOException {
		if(!this.in.equals(System.in)) 
			this.in.close();
	}

}
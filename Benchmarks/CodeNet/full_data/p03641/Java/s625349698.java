import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map.Entry;
import java.util.TreeMap;


public class Main {
	public static final String EOF = System.lineSeparator();
	public static long l=0,l2=0;
	public static void main(String[] args) throws IOException {
		l = System.currentTimeMillis();
		new Main().exec();
		l2 = System.currentTimeMillis();
/*
		System.out.println((l2-l)+"msec");
//*/		
	}

	public void exec() throws IOException {
		InputUtil in = new InputUtil();
		PrintWriter out = new PrintWriter(System.out);
		int N = in.nextInt();
		int[] P = in.nextInt(new int[N]);
		Permutation p = new Permutation(N,P,0,N); 
		p.calcQ();
		out.print(p.Q[0]);
		for(int i=1; i<N; i++){
			out.print(" ");
			out.print(p.Q[i]);
		}
		out.println("");
		out.flush();
	}
	
	
}

class Permutation {
	private TreeMap<ValueSet,Permutation> subPermMap = new TreeMap<>();
	int N = 0;
	int[] P = null;
	int from = 0;
	int to = 0;
	int[] Q = null;
	int qptr = -1;
	
	public Permutation(int n, int[] p, int from , int to) {
		N = n;
		P = p;
		this.from = from;
		this.to = to;
		Q = new int[N];
		qptr = 0;
	}
	
	public void setMinValueToMap(TreeMap<ValueSet,Permutation> map) {
		map.put(getMinValueSet(from,to),this);
	}
	
	
	private void addQ(ValueSet vs) {
		Q[qptr++] = P[vs.value1];
		Q[qptr++] = P[vs.value2];
	}
	
	public void calcQ() {
		ValueSet min = getMinValueSet(from,to);
		addQ(min);
		putSubMap(this, min, this.subPermMap);
		while(!subPermMap.isEmpty()) {
			Entry<ValueSet,Permutation> entry = subPermMap.pollFirstEntry();
			addQ(entry.getKey());
			putSubMap(entry.getValue(), entry.getKey(), this.subPermMap);
		}
		
	}
	
	private void putSubMap(Permutation p, ValueSet vs, TreeMap<ValueSet,Permutation> map) {
		if(p.from < vs.value1) {
			new Permutation(p.N, p.P, p.from, vs.value1).setMinValueToMap(map);
		}
		if(vs.value1+1 < vs.value2) {
			new Permutation(p.N, p.P, vs.value1+1, vs.value2).setMinValueToMap(map);
		}
		if(vs.value2+1 < p.to) {
			new Permutation(p.N, p.P, vs.value2+1, p.to).setMinValueToMap(map);
		}
		
	}
	
	private ValueSet getMinValueSet(int from, int to) {
		ValueSet ret = new ValueSet();
		ret.value1 = getMinElem(from,to);
		ret.value2 = getMinElem(ret.value1+1,to);
		ret.parent = this;
		return ret;
	}
	
	private int getMinElem(int from, int to){
		int minIndex = from;
		for(int i=from+2; i<to; i+=2){
			if(P[i] < P[minIndex]){
				minIndex = i;
			}
		}
		return minIndex;
	}
	
}

class ValueSet implements Comparable<ValueSet>{
	int value1;
	int value2;
	Permutation parent = null;	
	@Override
	public int compareTo(ValueSet vs) {
		int comp = Integer.compare(parent.P[value1], vs.parent.P[vs.value1]);
		if(comp == 0) {
			comp = Integer.compare(parent.P[value2], vs.parent.P[vs.value2]);
		}
		return comp;
	}
}


class InputUtil {
	//Static Fields
	private static final int BUFSIZ = 100000;
	
	//Fields
	protected InputStream in;
	private char[] buf = null;
	private int ptr = 0;
	private int max = -1;
	private BufferedReader br = null;
	
	//Constructors
	public InputUtil() {this(System.in,BUFSIZ);}
	public InputUtil(InputStream in, int bufsiz) {
		initBuf(bufsiz);
		initIn(in);
	}
	
	//Methods
	//Initializer
	protected void initIn(InputStream in) {br = new BufferedReader(new InputStreamReader(this.in = in));}
	protected void initBuf(int bufsiz) {buf = new char[bufsiz];}
	
	//buffer operation
	private void next() throws IOException {ptr++; readBuf();}
	private void readBuf() throws IOException {
		if(ptr >= max && br.ready()) {
			if(max>0) Arrays.fill(buf,0,max,(char)0);
			max = br.read(buf);
			ptr = 0;
		}
	}
	
	//Number Input Reader/Parser
	private boolean isNum(char b) {return '0' <= b && b <= '9'; }
	private boolean isMinus(char b) {return b=='-'; }

	private int _nextInt() throws IOException {
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
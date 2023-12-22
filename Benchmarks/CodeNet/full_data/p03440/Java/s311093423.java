import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

 
 
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
	char[] sex = null;
	/*/
	InputUtil in = new InputUtil();
	//*/
	PrintWriter out = new PrintWriter(System.out);
	int N = 0;
	int M = 0;
	int[] a = null;
	Table V = null;
	Table E = null;
	Table E2 = null;

	Map<Integer,Integer> grpMinimumMap = new HashMap<>();
	Map<Integer,DList> grpChildListMap = new HashMap<>();
	Map<Integer, Integer> grpParentMap = new HashMap<>();
	Map<Integer, TreeSet<Integer>> grpElemMap = new HashMap<>();
	boolean ans = true;
	long anscost = 0;
	

	
	public void input() throws IOException {
		N = in.nextInt();
		M = in.nextInt();
		V = new Table(N);
		E = new Table(M);
		V.setSeqColumnDatas("vid", 0, 1);
		a = in.nextInt(new int[N]);
		V.setColumnDatas("cost", a);
		V.setColumnDatas("grpNo", new int[N]);
		V.sort("cost", Table.SortOrder.ASC);
		int[] x = new int[M];
		int[] y = new int[M];
		for (int i=0; i<M; i++) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
		}
		E.setSeqColumnDatas("eid", 0, 1);
		E.setColumnDatas("x", x);
		E.setColumnDatas("y", y);
		
	}
	
	public void solve() throws IOException {
		//連結成分分解
		if (!renketu()) {
			ans = (N == 1);
			return;
		}

//		grpChildListMap = new HashMap<>();
//		grpParentMap = new HashMap<>();
		
		//各連結成分の要素数確認＆最終連結判定準備
		int grpNum = grpElemMap.size();
		int grpNum1 = 0;
		int grpNum2o = 0;
		for (int grpNo : grpElemMap.keySet()) {
			TreeSet<Integer> grpElem = grpElemMap.get(grpNo);
			if (grpElem.size() == 1) {
				grpNum1 ++;
			}
//			createNewGrp(grpNo);
			anscost += grpMinimumMap.get(grpNo);
		}
		
		//連結不能条件の判定
		grpNum2o = grpNum - grpNum1;
		if (grpNum1 > N - grpNum1 - (grpNum2o-1)*2) {
			ans = false;
			return;
		}
		
		HashSet<Integer> grpFirstSkipped= new HashSet<>();
		int pickupcount = 0;
		for(int i=0; i<V.rowSize(); i++) {
			if (pickupcount == (grpNum2o-1)*2 + grpNum1*2 - grpNum) {
				return;
			}
			int vid = V.get(i, "vid");
			int grpNo = V.get(i, "grpNo");
			int cost = V.get(i, "cost");
			//各Grp最初の要素はスキップ
			if (!grpFirstSkipped.contains(grpNo)) {
				grpFirstSkipped.add(grpNo);
				continue;
			}
			anscost += cost;
			pickupcount ++;
		}
	}
	
	private boolean renketu () {
		int[] grpNo = V.getColumnDatas("grpNo");
		int[] x = E.getColumnDatas("x");
		int[] y = E.getColumnDatas("y");
		int nextGrpNo = 1;
		for (int i=0; i<M; i++) {
			int gx = grpNo[x[i]];
			int gy = grpNo[y[i]];
			boolean xIsNew = (gx == 0); 
			boolean yIsNew = (gy == 0);
			if (xIsNew && yIsNew) {
				createNewGrp(nextGrpNo, Math.min(a[x[i]],a[y[i]]));
				grpNo[x[i]] = grpNo[y[i]] = nextGrpNo;
				nextGrpNo++;
			} else if (xIsNew) {
				grpNo[x[i]] = gy;
			} else if (yIsNew) {
				grpNo[y[i]] = gx;
			} else  {
				mergeGroup(gx, gy);
			}
		}
		if (grpParentMap.size() == 0) {
			return false;
		}
		for(int i=0; i<N; i++) {
			if (grpNo[i] != 0) {
				grpNo[i] = grpParentMap.get(grpNo[i]);
				if (grpElemMap.containsKey(grpNo[i])) {
					grpElemMap.get(grpNo[i]).add(i);
					continue;
				}
			} else {
				grpNo[i] = nextGrpNo;
				grpMinimumMap.put(grpNo[i], a[i]);
				nextGrpNo++;
			}
			TreeSet<Integer> list = new TreeSet<>();
			list.add(i);
			grpElemMap.put(grpNo[i],list);
		}
		return true;
	}

	private void mergeGroup(int grp1, int grp2) {
		int grp1Parent = grpParentMap.get(grp1);
		int grp2Parent = grpParentMap.get(grp2);
		DList grp1ChildHead= grpChildListMap.get(grp1Parent);
		DList grp2ChildHead= grpChildListMap.get(grp2Parent);
		int grpChildParent;
		int grpParentParent;
		if (grp1ChildHead.size > grp2ChildHead.size) {
			grpParentParent = grp1Parent;
			grpChildParent = grp2Parent;
		} else {
			grpParentParent = grp2Parent;
			grpChildParent = grp1Parent;
		}
		DList grpChildListHead = grpChildListMap.get(grpChildParent);
		DList grpChildListPtr = grpChildListHead; 
		while (grpChildListPtr != null) {
			grpParentMap.put(grpChildListPtr.value, grpParentParent);
			grpChildListPtr = grpChildListPtr.next;
		}
		DList grpParentListHead = grpChildListMap.get(grpParentParent);
		grpParentListHead.merge(grpChildListHead);
		grpChildListMap.remove(grpChildParent);
		grpMinimumMap.put(grpParentParent, Math.min(grpMinimumMap.get(grpParentParent), grpMinimumMap.get(grpChildParent)));
		grpMinimumMap.remove(grpChildParent);
	}

	private void createNewGrp(int nextGrpNo, int minCost) {
		grpParentMap.put(nextGrpNo, nextGrpNo);
		grpChildListMap.put(nextGrpNo, new DList(nextGrpNo));
		grpMinimumMap.put(nextGrpNo, minCost);
	}
	
	public void output() {
		out.println(ans ? anscost : "Impossible");
		out.flush();
	}
}

class DList {
	boolean isHead = true;
	int size = 0;
	int value = 0; 
	DList next = null;
	DList head = this;
	DList tail = this;
	public DList(int v) {
		this.value = v;
		this.size = 1;
	}
	private DList(DList head, int v) {
		this(v);
		this.head = head;
	}
	public boolean isHead() {
		return isHead;
	}
	public void add(int v) {
		DList dl = new DList(head, v);
		if (next == null) {
			next = dl;
		} else {
			tail.next = dl;
		}
		tail = dl;
		size++;
	}
	public void merge(DList dl) {
		if (!dl.isHead) {
			throw new IllegalArgumentException();
		}
		dl.isHead = false;
		dl.head = head;
		if (next == null) {
			next = dl;
		} else {
			tail.next = dl;
		}
		tail = dl.tail;
		size += dl.size;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(value);
		DList ptr = next;
		while(ptr != null) {
			sb.append(",").append(ptr.value);
			ptr = ptr.next;
		}
		return sb.toString();
	}
}

class Table {
	public enum SortOrder { ASC, DESC }

	Integer[] index = null;
	Map<String, int[]> dataTable = new HashMap<>();
	String sortKey = null;
	int[] sortKeyArray = null;
	SortOrder sortOrder = SortOrder.ASC;
	
	public Table(int rowNum) {
		this.index = new Integer[rowNum];
		for(int i=0; i<rowNum; i++) {
			this.index[i] = i;
		}
	}
	
	public int rowSize() {
		return this.index.length;
	}

	public void setSeqColumnDatas(String colId, int startIndex, int incNum){
		int[] colDatas = new int[this.index.length];
		for (int i=0; i<colDatas.length; i++) {
			colDatas[i] = startIndex + i*incNum;
		}
		setColumnDatas(colId, colDatas);
	}
	
	public void setColumnDatas(String colId, int[] colDatas){
		if(colId != null && colId.length() > 0 && colDatas != null){
			int[] colDatasClone = new int[this.index.length];
			System.arraycopy(colDatas, 0, colDatasClone, 0, Math.min(colDatas.length, colDatasClone.length));
			this.dataTable.put(colId, colDatas);
		}
	}
	
	public void setSortKey(String sortKey) {
		this.sortKey = sortKey;
		this.sortKeyArray = dataTable.get(this.sortKey);
	}
	
	public void setSortOrder(SortOrder sortOrder) {
		this.sortOrder = sortOrder;
	}
	
	public void sort(String sortKey, SortOrder sortOrder) {
		if(sortKey != null) {
			setSortKey(sortKey);
		}
		if(sortOrder != null) {
			setSortOrder(sortOrder);
		}
		sort();
	}
	
	public void sort() {
		Arrays.sort(this.index, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if(sortOrder.equals(SortOrder.ASC)) {
					return Integer.compare(sortKeyArray[o1.intValue()], sortKeyArray[o2.intValue()]);
				} else {
					return Integer.compare(sortKeyArray[o2.intValue()], sortKeyArray[o1.intValue()]);
				}
			}
		});
	}
	
	
	public int get(int rowIndex, String colId) {
		int[] colArray = dataTable.get(colId);
		return colArray[this.index[rowIndex]];
	}

	public int[] getColumnDatas(String colId) {
		return dataTable.get(colId);
	}
	
	public void set(int rowIndex, String colId, int val) {
		int[] colArray = dataTable.get(colId);
		colArray[this.index[rowIndex]] = val;
	}
	
	public Table copy () {
		Table ret = new Table(this.index.length);
		ret.dataTable = this.dataTable;
		return ret;
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

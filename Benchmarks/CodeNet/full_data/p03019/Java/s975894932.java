import java.io.IOException;
import java.io.InputStream;
import java.util.*;
 
public class Main implements Runnable {
	
    public static void main(String[] args) {
    	new Thread(null, new Main(), "", 1 * 1024 * 1024).start();
    }
    
    public void run() {
        FastScanner sc = new FastScanner();
        
        int n = sc.nextInt();
        int x = sc.nextInt();
        Test[] t = new Test[n];
        Test.setX(x);
        
        for(int i=0;i<n;i++){
        	t[i] = new Test(sc.nextInt(),sc.nextInt(),sc.nextInt());
        }
        
        Arrays.sort(t); //idx小→優先
        
        SegmentTree st = new SegmentTree(n);
        
        for(int i=0;i<n;i++){
        	st.update(i,t[i].burden());
        }
        
        long sum = 0; //上回っている量
        long sumtime = 0;
        int idx = -1;
        
        while(sum < st.sum(idx+1,n)){
        	idx += 1;
        	sum += t[idx].maxUp();
        	sumtime += x;
        }
        
        long aite = st.sum(idx+1,n);
        int saboriburden = t[idx].u;
        int sabori = (int) ((sum - aite)/saboriburden);
        sumtime -= sabori;
        
        System.out.println(sumtime);
        
    }
 
}

class Test implements Comparable<Test>{
	static int x;
	int b;
	int l;
	int u;
	
	public Test(int b,int l,int u){
		this.b = b;
		this.l = l;
		this.u = u;
	}
	
	static void setX(int y){
		x = y;
	}
	
	long maxUp(){
		return (x-b)*u;
	}
	
	long burden(){
		return b*l;
	}
	
	long priority(){
		return maxUp()+burden();
	}
	
	@Override
	public int compareTo(Test o){
		return Long.compare(o.priority(),this.priority());
	}
	
}

class SegmentTree {
	long[] tree;
	
	//要素数で初期化
	public SegmentTree(int n){
		int num = 1;
		while(num<n){
			num = num*2;
		}
		tree = new long[num*2-1];
		Arrays.fill(tree,identityElement());
	}
	
	//配列で初期化
	public SegmentTree(long[] start){
		int num = 1;
		while(num<start.length){
			num = num*2;
		}
		tree = new long[num*2-1];
		
		for(int i=0;i<start.length;i++){
			update(i,start[i]);
		}
	}
	
	//演算の中身（結合法則の成立が必要）
	long ope(long n,long m){
		return n+m;
	}
	
	//単位元
	int identityElement(){
		return 0;
	}
	
	//インデックス数
	int inum(){
		return (tree.length+1)/2;
	}
	
	//i番目の値をnに更新
	void update(int i, long n){
		i = inum() + i - 1; //単体のa_iが格納されているindex
		tree[i] = n;
		while (i > 0) {
			i = (i - 1) / 2; //1つ上の区間和が格納されているindex
			tree[i] = ope(tree[i * 2 + 1], tree[i * 2 + 2]);
		}
	}

	//O(logN)で[start,goal)の区間和（半開区間であることに注意）
	long sum(int start, int end) {
		return sum(start, end, 0, 0, inum());
	}

	//[a,b)の区間和, kは自分のいるセグ木のインデックス、対象範囲は[l,r)
	private long sum(int a, int b, int k, int l, int r) {
		
		// 要求区間と対象区間が交わらない -> 適当に返す
		if(r <= a || b <= l){
			return identityElement();
		}
			
		// 要求区間が対象区間を完全に被覆 -> 対象区間を答えの計算に使う
		if(a<=l && r<=b){
			return tree[k];
		}
		else{
			long lv = sum(a, b, 2*k+1, l, (l+r)/2);
			long rb = sum(a, b, 2*k+2, (l+r)/2, r);
			return ope(lv, rb);
		}
	}
	
}

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}
	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
	}
	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
         
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        jlist l = new jlist();

        for(int i=0;i<n;i++){
        	l.addLast(sc.nextInt());
        }
        
        int max = Integer.MIN_VALUE;
        
        int nega = 0;
        for(int i=k;i>0;i-=2){
        	max = Math.max(max, l.getMax(k,nega));
        	nega += 1;
        }
        

        System.out.println(max);
        
    }
    
	//lowerBound
	static int lowerBound(Integer[] a, int key){
		int idx = Arrays.binarySearch(a, key, (x,y)->x.compareTo(y)>=0?1:-1);
		
		if(idx<0){
			idx = ~idx;
		}
		
		return idx;
	}
	static int lowerBound(ArrayList<Integer> a, int key){
		int idx = Collections.binarySearch(a, key, (x,y)->x.compareTo(y)>=0?1:-1);
		
		if(idx<0){
			idx = ~idx;
		}
		
		return idx;
	}
	
	//ソートを崩さず挿入（lowerBoundが必要）
	static void sortedInsert(ArrayList<Integer> l, int key){
		int idx = lowerBound(l,key);
		l.add(idx,key);
	}
	
	//最大排出
	static int maxNe(ArrayList<Integer> l, int n){
		int sum = 0;
		int num = Math.min(n, l.size());
		for(int i=0; i<num;i++){
			sum += l.get(i);
		}
		
		return -sum;
	}
	

}

class jlist{
	ArrayList<Integer> q;
	
	public jlist(){
		q = new ArrayList<>();
	}
	
	void addFirst(int value){
		q.add(0,value);
	}
	
	void addLast(int value){
		q.add(value);
	}
	
	int checkF(int i){
		return q.get(i);
	}
	
	int checkL(int i){
		return q.get(q.size()-1-i);
	}
	
	int pollFirst(){
		return q.remove(0);
	}
	
	int pollLast(){
		return q.remove(q.size()-1);
	}
	
	int pollMax(){
		if(checkF(0)>checkL(0)){
			return pollFirst();
		}
		else{
			return pollLast();
		}
	}
	
	int getMax(int n, int nega){
		int pn = n-nega;
		
		int[] sum = new int[pn+1]; //fnum=iのとき
		
		ArrayList<Integer> nl = new ArrayList<>();
		
		for(int fnum=0;fnum<pn;fnum++){
			for(int i=0;i<fnum;i++){
				int c = checkF(i);
				sum[fnum] += c;
				
				if(c<0){
					sortedInsert(nl,c);
				}
			}
			
			for(int i=0;i<pn-fnum;i++){
				int c = checkL(i);
				sum[fnum] += c;
				
				if(c<0){
					sortedInsert(nl,c);
				}
			}
			
			for(int i=0;i<Math.min(nl.size(),nega);i++){
				sum[fnum] -= nl.get(i);
			}
		}
		
		int max = Integer.MIN_VALUE;
		for(int i=0;i<pn+1;i++){
			max = Math.max(max, sum[i]);
		}
		
		return max;
	}
	
	//lowerBound
	static int lowerBound(Integer[] a, int key){
		int idx = Arrays.binarySearch(a, key, (x,y)->x.compareTo(y)>=0?1:-1);
		
		if(idx<0){
			idx = ~idx;
		}
		
		return idx;
	}
	static int lowerBound(ArrayList<Integer> a, int key){
		int idx = Collections.binarySearch(a, key, (x,y)->x.compareTo(y)>=0?1:-1);
		
		if(idx<0){
			idx = ~idx;
		}
		
		return idx;
	}
	
	//ソートを崩さず挿入（lowerBoundが必要）
	static void sortedInsert(ArrayList<Integer> l, int key){
		int idx = lowerBound(l,key);
		l.add(idx,key);
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
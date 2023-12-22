import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	
	
    public static void main(String[] args) {
    	FastScanner sc = new FastScanner();
    	int h = sc.nextInt();
    	int w = sc.nextInt();
    	
    	boolean[][] a = new boolean[h][w];
    	
    	boolean end = true;
    	int max = 0;
    	
    	for(int i=0;i<h;i++){
    		char[] c = sc.next().toCharArray();
    		for(int j=0;j<w;j++){
    			if(c[j]=='#'){
        			a[i][j] = true;
    			}
    			else{
    				a[i][j] = false;
    			}
    		}
    	}
    	
    	ArrayList<Pair> list = new ArrayList<>();
    	ArrayList<Pair> endlist = new ArrayList<>();
    	
    	for(int i=0;i<h;i++){
    		for(int j=0;j<w;j++){
    			list.add(new Pair(i,j));
    		}
    	}
    	
    	while(!list.isEmpty()){
    		Pair some = list.get(0);
    		
    		boolean get = false;
        	ArrayDeque<Pair> deq = new ArrayDeque<>();
        	deq.add(some);
        	
        	Pair res = new Pair(0,0);
        	
    		while(!get){
    			Pair ima = deq.pollFirst();
    			
    			if(a[ima.a][ima.b] == true){
    				int cmax = Math.abs(some.a - ima.a) + Math.abs(some.b - ima.b);
    				if(cmax > max){
    					max = cmax;
    				}
    				res = ima;
    				get = true;
    			}
    			else{
    				for(Pair iman : ima.next(h, w)){
    					deq.offerLast(iman);
    				}
    			}
    		}
    		
    		int tate = Math.abs(some.a - res.a);
    		int yoko = Math.abs(some.b - res.b);
    		
    		for(int i=res.a-tate;i<=res.a+tate;i++){
        		for(int j=res.b-yoko;j<=res.b+yoko;j++){
        			list.remove(new Pair(i,j));
        		}
    		}
    	}
    	
    	
    	System.out.println(max);


    }
    
}

class Pair implements Comparable<Pair>{
	int a,b;
	
	public Pair(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public ArrayList<Pair> next(int h, int w){
    	ArrayList<Pair> list = new ArrayList<>();
    	if(a!=0){
    		list.add(new Pair(a-1,b));
    	}
    	if(a!=h-1){
    		list.add(new Pair(a+1,b));
    	}
    	if(b!=0){
    		list.add(new Pair(a,b-1));
    	}
    	if(b!=w-1){
    		list.add(new Pair(a,b+1));
    	}
    	
    	return list;
	}
	
	@Override
	public boolean equals(Object o){
		if(o instanceof Pair){
			Pair p = (Pair) o;
			return a == p.a && b == p.b;
		}
		return super.equals(o);
	}
	
	@Override
	public int compareTo(Pair o){
		if(a!=o.a){
			return Integer.compare(a,o.a);
		}
		return Integer.compare(b, o.b);
	}
	
	@Override
	public int hashCode(){
		return a+b;
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
        }else{
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
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
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
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}
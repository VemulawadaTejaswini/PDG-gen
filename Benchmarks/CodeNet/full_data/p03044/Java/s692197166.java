import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	
    public static void main(String[] args) {
    	FastScanner sc = new FastScanner();
 
    	int n = sc.nextInt();
    	WGraph g = new WGraph(n);
    	
    	for(int i=0;i<n-1;i++){
    		g.addEdge(sc.nextInt()-1,sc.nextInt()-1,sc.nextInt()%2);
    	}
    	
    	int[] ans = g.ans();
    	
    	for(int i=0;i<n;i++){
    		System.out.println(ans[i]-1);
    	}

    }
    
    
    
}

class WGraph {
	WEdgeList[] elist;
	static int[] g;
	
	public WGraph(int vnum){
		this.elist = new WEdgeList[vnum];
		for(int i=0;i<vnum;i++){
			elist[i] = new WEdgeList();
		}
	}

	//同じ辺を複数回追加すると多重辺が生まれてしまう
	public void addEdge(int a, int b, int w){
		elist[a].add(new WEdge(b,w));
		elist[b].add(new WEdge(a,w));
	}
	
	//頂点数を返す
	int vnum(){
		return elist.length;
	}
	
	//辺数を返す
	int edgeNum(){
		int sum = 0;
		for(WEdgeList l:elist){
			sum += l.size();
		}
		return sum/2;
	}
	
	//隣接判定
	boolean isNext(int n, int m){
		return elist[n].contains(m);
	}
	
	//隣接する全ての頂点を返す
	ArrayList<Integer> nextList(int n){
		ArrayList<Integer> l = new ArrayList<>();
		for(WEdge e:elist[n]){
			l.add(e.to);
		}
		return l;
	}
	
	//隣接する全ての辺を返す
	WEdgeList EList(int n){
		return elist[n];
	}
	
	int[] ans(){
		int [] isB = new int[vnum()];
		
		isB[0] = 2;
		
		ArrayDeque<Integer> q = new ArrayDeque<>();
		q.offerFirst(0);
		
		while(!q.isEmpty()){
			int ima = q.pollFirst();
			for(WEdge e:EList(ima)){
				if(isB[e.to] == 0){
					if(e.w == 0){
						isB[e.to] = isB[ima];
					}
					else{
						if(isB[ima] == 2){
							isB[e.to] = 1;
						}
						else{
							isB[e.to] = 2;
						}
					}
					q.offerLast(e.to);
				}
				else{
					
				}
			}
		}
		
		return isB;
	}
	
	class WEdgeList extends ArrayList<WEdge>{
		private static final long serialVersionUID = 4901656039324433445L;
	}
	class WEdge{
		int to;
		int w;
		
		public WEdge(int to, int w){
			this.to = to;
			this.w = w;
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
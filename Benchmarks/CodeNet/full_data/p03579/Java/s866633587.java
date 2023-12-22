import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.math.BigInteger;

public class Main {
	
    public static void main(String[] args) {
    	FastScanner sc = new FastScanner();

    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	SGraph g = new SGraph(n);
    	
    	int[] a = new int[m];
    	int[] b = new int[m];
    	for(int i=0;i<m;i++){
    		a[i] = sc.nextInt();
    		b[i] = sc.nextInt();
    	}
    	for(int i=0;i<m;i++){
    		g.addEdge(a[i]-1, b[i]-1);
    	}
    	
    	int bnum = g.bipartiteNum();
    	
    	if(bnum == -1){
        	System.out.println(BigInteger.valueOf(n).multiply(BigInteger.valueOf(n-1)).divide(BigInteger.valueOf(2)).subtract(BigInteger.valueOf(m)));
    	}
    	else{
        	System.out.println(BigInteger.valueOf(bnum).multiply(BigInteger.valueOf(n).subtract(BigInteger.valueOf(bnum))).subtract(BigInteger.valueOf(m)));
    	}
    	
    }
    
}
 
class SGraph {

	NodeList[] nlist; //隣接リスト
	
	public SGraph(int vnum){
		this.nlist = new NodeList[vnum];
		for(int i=0;i<vnum;i++){
			nlist[i] = new NodeList();
		}
	}

	//2部グラフかどうか判定
	boolean isBipartite(){
		//白黒で2彩色可能か判定
		boolean[] isBlack = new boolean[vnum()];
		boolean[] isChecked = new boolean[vnum()];
		java.util.ArrayDeque<Integer> q = new java.util.ArrayDeque<>();
		
		boolean con = true;
		
		while(con){
			
			int core = -1;
			for(int i=0;i<vnum();i++){
				if(!isChecked[i]){
					core = i;
				}
			}
			
			if(core!=-1){
				q.offerFirst(core);
				isBlack[core] = true;
				isChecked[core] = true;
				
				while(!q.isEmpty()){
					int now = q.pollFirst();
					
					for(int i:nextList(now)){
						if(!isChecked[i]){
							isChecked[i] = true;
							isBlack[i] = !isBlack[now];
							q.offerFirst(i);
						}
						else{
							if(isBlack[i] == isBlack[now]){
								return false;
							}
						}
					}
				}	
			}
			else{
				con = false;
			}	
			
		}
	
		return true;
	}
	
	int bipartiteNum(){
		//白黒で2彩色可能か判定
		boolean[] isBlack = new boolean[vnum()];
		boolean[] isChecked = new boolean[vnum()];
		java.util.ArrayDeque<Integer> q = new java.util.ArrayDeque<>();
		
		q.offerFirst(0);
		isBlack[0] = true;
		isChecked[0] = true;
		
		while(!q.isEmpty()){
			int now = q.pollFirst();
			
			for(int i:nextList(now)){
				if(!isChecked[i]){
					isChecked[i] = true;
					isBlack[i] = !isBlack[now];
					q.offerFirst(i);
				}
				else{
					if(isBlack[i] == isBlack[now]){
						return -1;
					}
				}
			}
		}	
	
		//ここに到達すれば二部グラフ
		int blacknum = 0;
		for(int i=0;i<vnum();i++){
			if(isBlack[i]){
				blacknum += 1;
			}
		}
		
		return Math.min(blacknum, vnum()-blacknum);
	}
	
	int[] distanceList(int n){
		
		java.util.ArrayDeque<Integer> q = new java.util.ArrayDeque<>();
		int[] d = new int[vnum()];	//nとの距離。未チェックなら-1。
		for(int i=0;i<vnum();i++){
			d[i] = -1;
		}
		
		q.add(n);
		d[n] = 0;
		
		while(!q.isEmpty()){
			int now = q.pollFirst();
			
			for(int i:nextList(now)){
				if(d[i] == -1){
					d[i] = d[now]+1;
					q.offerLast(i);
				}
			}
		}
		
		return d;
	}
	
	//辺の追加（同じ辺を複数回追加すると多重辺になる）
	void addEdge(int n, int m){
		nlist[n].add(m);
		nlist[m].add(n);
	}
	
	//頂点数を返す
	int vnum(){
		return nlist.length;
	}
	
	//辺数を返す
	int edgeNum(){
		int sum = 0;
		for(NodeList l:nlist){
			sum += l.size();
		}
		return sum/2;
	}
	
	//隣接判定
	boolean isNext(int n, int m){
		return nlist[n].contains(m);
	}
	
	//隣接する全ての頂点を返す
	NodeList nextList(int n){
		return nlist[n];
	}
	
	//含まれる木の数を返す
	int treeNum(){
    	boolean[] isVisited = new boolean[vnum()];
    	int[] par = new int[vnum()];
    	int TreeNum = 0;
    	
    	boolean con = true;
    	
    	while(con){
    		int core = -1;
    		
    		for(int i=0;i<vnum();i++){
    			if(!isVisited[i]){
    				core = i;
    				break;
    			}
    		}
    		
    		if(core==-1){
    			con = false;
    		}
    		else{
    			boolean isTree = true;
    			ArrayDeque<Integer> s = new ArrayDeque<>();
    			s.offerFirst(core);
    			isVisited[core] = true;
    			
    			while(!s.isEmpty()){
    				int now = s.pollFirst();
    				
    				for(int i:this.nextList(now)){
    					
    					if(isVisited[i]){
    						if(par[now] != i){
        						isTree = false;
    						}
    					}
    					else{
        					s.offerFirst(i);
        					isVisited[i] = true;
        					par[i] = now;
    					}
    				}

    			}
    			
    			if(isTree){
    				TreeNum += 1;
    			}
    		}
    	}
    	
    	return TreeNum;
	}
	
	//森かどうか返す
	boolean isForest(){
    	boolean[] isVisited = new boolean[vnum()];
    	int[] par = new int[vnum()];
    	
    	boolean con = true;
    	
    	while(con){
    		int core = -1;
    		
    		for(int i=0;i<vnum();i++){
    			if(!isVisited[i]){
    				core = i;
    				break;
    			}
    		}
    		
    		if(core==-1){
    			con = false;
    		}
    		else{
    			boolean isTree = true;
    			ArrayDeque<Integer> s = new ArrayDeque<>();
    			s.offerFirst(core);
    			isVisited[core] = true;
    			
    			while(!s.isEmpty()){
    				int now = s.pollFirst();
    				
    				for(int i:this.nextList(now)){
    					
    					if(isVisited[i]){
    						if(par[now] != i){
        						isTree = false;
    						}
    					}
    					else{
        					s.offerFirst(i);
        					isVisited[i] = true;
        					par[i] = now;
    					}
    				}

    			}
    			
    			if(!isTree){
    				return false;
    			}
    		}
    	}
    	
    	return true;
	}
	
	//連結成分数を返す
	int CCNum(){
    	boolean[] isVisited = new boolean[vnum()];
    	int CNum = 0;
    	
    	boolean con = true;
    	
    	while(con){
    		int core = -1;
    		
    		for(int i=0;i<vnum();i++){
    			if(!isVisited[i]){
    				core = i;
    				break;
    			}
    		}
    		
    		if(core==-1){
    			con = false;
    		}
    		else{

    			ArrayDeque<Integer> s = new ArrayDeque<>();
    			s.offerFirst(core);
    			isVisited[core] = true;
    			CNum += 1;
    			
    			while(!s.isEmpty()){
    				int now = s.pollFirst();
    				
    				for(int i:this.nextList(now)){
    					
    					if(!isVisited[i]){
        					s.offerFirst(i);
        					isVisited[i] = true;
    					}

    				}

    			}

    		}
    	}
    	
    	return CNum;
	}

	//連結成分に分割
	java.util.LinkedList<SGraph> CCSet(){
		java.util.LinkedList<SGraph> set = new java.util.LinkedList<>();
		
    	boolean[] isVisited = new boolean[vnum()];

    	boolean con = true;
    	
    	while(con){
    		int core = -1;
    		
    		for(int i=0;i<vnum();i++){
    			if(!isVisited[i]){
    				core = i;
    				break;
    			}
    		}
    		
    		if(core==-1){
    			con = false;
    		}
    		else{
    			java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
    			ArrayDeque<Integer> s = new ArrayDeque<>();
    			s.offerFirst(core);
    			list.add(core);
    			isVisited[core] = true;
    			
    			while(!s.isEmpty()){
    				int now = s.pollFirst();
    				
    				for(int i:this.nextList(now)){
    					
    					if(!isVisited[i]){
        					s.offerFirst(i);
        					isVisited[i] = true;
        					list.add(i);
    					}
    				}

    			}
    			
    			Collections.sort(list);;
    			int size = list.size();
    			SGraph g = new SGraph(size);
    			
    			int[] newindex = new int[this.vnum()];
    			
    			for(int i=0;i<list.size();i++){
    				newindex[list.get(i)] = i;
    			}
    			
    			for(int i:list){
    				for(int j:this.nlist[i]){
    					if(i<j){
        					g.addEdge(newindex[i],newindex[j]);
    					}
    				}
    			}
    			
    			set.add(g);
    			
    		}
    	}
    	
    	return set;
	}

	//2点間距離をBFSで求める。連結していないなら-1を返す。
	int distance(int n, int m){
		
		java.util.ArrayDeque<Integer> q = new java.util.ArrayDeque<>();
		int[] d = new int[vnum()];	//nとの距離。未チェックなら-1。
		for(int i=0;i<vnum();i++){
			d[i] = -1;
		}
		
		q.add(n);
		d[n] = 0;
		
		while(!q.isEmpty()){
			int now = q.pollFirst();
			
			for(int i:nextList(now)){
				if(d[i] == -1){
					if(i==m){
						return d[now]+1;
					}
					
					d[i] = d[now]+1;
					q.offerLast(i);
				}
			}
		}
		
		return -1;
	}
	
}

class NodeList extends ArrayList<Integer>{
	private static final long serialVersionUID = 1L;
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
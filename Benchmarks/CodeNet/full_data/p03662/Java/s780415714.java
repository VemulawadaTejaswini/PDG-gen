import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.math.BigInteger;
 
public class Main implements Runnable {
	
	static int mod = 1000000007;
	
    public static void main(String[] args) {
    	new Thread(null, new Main(), "", 1024 * 1024 * 1024).start();
    }
    
    public void run() {
       	PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();
        
        int n = sc.nextInt();
        SGraph g = new SGraph(n);
        
        for(int i=0;i<n-1;i++){
        	g.addEdge(sc.nextInt()-1, sc.nextInt()-1);
        }
        
        if(g.isFWin()){
        	out.println("Fennec");
        }
        else{
        	out.println("Snuke");
        }
        
        out.flush();
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
	
	boolean isFWin(){
		int S = vnum()-1;
		ArrayList<Integer> way = shortestWay(0,S);
		
		boolean[] checked = new boolean[vnum()];
		
		int r0num = 0;
		int rSnum = 0;
		checked[0] = true;
		checked[S] = true;

		ArrayDeque<Integer> r0 = new ArrayDeque<>();
		for(int i:nextList(0)){
			if(i != way.get(1)){
				r0num ++;
				r0.offerFirst(i);
				checked[i] = true;
			}
		}
		while(!r0.isEmpty()){
			int now = r0.pollFirst();
			
			for(int i:nextList(now)){
				if(!checked[i]){
					checked[i] = true;
					r0.offerFirst(i);
					r0num ++;
				}
			}
		}
		
		ArrayDeque<Integer> rS = new ArrayDeque<>();
		for(int i:nextList(S)){
			if(i != way.get(way.size()-2)){
				rSnum ++;
				rS.offerFirst(i);
				checked[i] = true;
			}
		}
		while(!rS.isEmpty()){
			int now = rS.pollFirst();
			
			for(int i:nextList(now)){
				if(!checked[i]){
					checked[i] = true;
					rS.offerFirst(i);
					rSnum ++;
				}
			}
		}
		
		r0num += way.size()/2;
		rSnum += way.size()/2;
		if(way.size()%2 != 0){
			r0num ++;
		}
		
		for(int i=0;i<vnum();i++){
			if(!checked[i]){
				int d0 = distance(0,i);
				int dS = distance(S,i);
				if(dS>d0){
					r0num++;
				}
				else{
					rSnum++;
				}
			}
		}

		return r0num > rSnum;
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
    	int checkid = 0;

    	while(true){
    		int core = -1;
    		
    		for(int i=checkid;i<vnum();i++){
    			if(!isVisited[i]){
    				core = i;
    				checkid = i+1;
    				break;
    			}
    		}
    		
    		if(core==-1){
    			break;
    		}
    		
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
    	
    	return TreeNum;
	}
	
	//森かどうか返す
	boolean isForest(){
    	boolean[] isVisited = new boolean[vnum()];
    	int[] par = new int[vnum()];
    	int checkid = 0;

    	while(true){
    		int core = -1;
    		
    		for(int i=checkid;i<vnum();i++){
    			if(!isVisited[i]){
    				core = i;
    				checkid = i+1;
    				break;
    			}
    		}
    		
    		if(core==-1){
    			break;
    		}
    		
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
    	
    	return true;
	}
	
	//連結成分数を返す（森ならV-Eでいい）
	int CCNum(){
    	boolean[] isVisited = new boolean[vnum()];
    	int CNum = 0;
    	int checkid = 0;
    	
    	while(true){
    		int core = -1;
    		
    		for(int i=checkid;i<vnum();i++){
    			if(!isVisited[i]){
    				core = i;
    				checkid = i+1;
    				break;
    			}
    		}
    		
    		if(core==-1){
    			break;
    		}
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
    	
    	return CNum;
	}

	//連結成分に分割
	ArrayList<SGraph> CCSet(){
		ArrayList<SGraph> set = new ArrayList<>();
		
    	boolean[] isVisited = new boolean[vnum()];
    	int checkid = 0;
    	
    	while(true){
    		int core = -1;
    		
    		for(int i=checkid;i<vnum();i++){
    			if(!isVisited[i]){
    				core = i;
    				checkid = i+1;
    				break;
    			}
    		}
    		
    		if(core==-1){
    			break;
    		}
    		
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
					if(i<=j){
    					g.addEdge(newindex[i],newindex[j]);
					}
				}
			}
			
			set.add(g);
    	}
    	
    	return set;
	}

	//2点間距離をBFSで求める。到達不可は-1。
	int distance(int n, int m){
		
		ArrayDeque<Integer> q = new ArrayDeque<>();
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
	
	//n→mへの最短経路
	ArrayList<Integer> shortestWay(int n, int m){
		ArrayDeque<Integer> q = new ArrayDeque<>();
		int[] d = new int[vnum()];	//nとの距離。未チェックなら-1。
		int[] par = new int[vnum()];	//親
		for(int i=0;i<vnum();i++){
			d[i] = -1;
		}
		
		//便宜上m→nで探す（リストを逆順にする手間が省ける）
		q.add(m);
		d[m] = 0;
		par[m] = -1;
		
		while(!q.isEmpty()){
			int now = q.pollFirst();
			
			for(int i:nextList(now)){
				if(d[i] == -1){
					if(i==n){
						par[i] = now;
						ArrayList<Integer> way = new ArrayList<>();
						for(int k=i;k!=-1;k=par[k]){
							way.add(k);
						}
						return way;
					}
					
					d[i] = d[now]+1;
					par[i] = now;
					q.offerLast(i);
				}
			}
		}
		
		//経路なし
		return new ArrayList<Integer>();
	}
	
	//nとの距離のリストを返す（BFS）。到達不可は-1。
	int[] distanceList(int n){
		
		ArrayDeque<Integer> q = new ArrayDeque<>();
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
	
	//2部グラフかどうか判定
	boolean isBipartite(){
		//白黒で2彩色可能か判定
		boolean[] isBlack = new boolean[vnum()];
		boolean[] isChecked = new boolean[vnum()];
		ArrayDeque<Integer> q = new ArrayDeque<>();
		
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
	
	//2部グラフにしたときの、左右の頂点数のうち小さい方を返す（連結前提、不可能なら-1を返す）
	int bipartiteNum(){
		//白黒で2彩色可能か判定
		boolean[] isBlack = new boolean[vnum()];
		boolean[] isChecked = new boolean[vnum()];
		ArrayDeque<Integer> q = new ArrayDeque<>();
		
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

	//橋を列挙（連結グラフ）（indexは小→大）
	public ArrayList<EdgePair> bridge(){
		int[] ord = new int[vnum()];
		int[] ordidx = new int[vnum()]; //そのオーダーを持つ頂点のインデックス
		int[] lowlink = new int[vnum()];
		Arrays.fill(lowlink, -1);
		
		//DFS木を作り、ordを求める
		ArrayDeque<Integer> a = new ArrayDeque<>();
		a.offerFirst(0);
		int noword = 0;
		boolean isVisited[] = new boolean[vnum()];
		int parent[] = new int[vnum()];
		HashSet<EdgePair> tree = new HashSet<>(); //DFS木に含まれる辺（ここになければ後退辺
		
		while(!a.isEmpty()){
			int now = a.pollFirst();
			
			if(isVisited[now]){
				continue;
			}
			isVisited[now] = true;
			tree.add(new EdgePair(parent[now],now));
			
			ord[now] = noword;
			ordidx[noword] = now;
			noword++;
			
			for(int i:nextList(now)){
				a.offerFirst(i);
				parent[i] = now;
			}
		}
		
		//後ろからlowlinkを求める
		for(int i=vnum()-1;i>=0;i--){
			int now = ordidx[i];
			int min = i;
			for(int j:nextList(now)){
				if(ord[j]<i){	//jが親
					if(tree.contains(new EdgePair(j,now))){ //後退辺でないなら数えない
						continue;
					}
				}
				if(lowlink[j]!=-1){
					if(min>lowlink[j]){
						min = lowlink[j];
					}
				}
				else{
					if(min>ord[j]){
						min = ord[j];
					}
				}
			}
			lowlink[now] = min;
		}
		
		ArrayList<EdgePair> ans = new ArrayList<>();
		
		//全ての辺が橋かチェック
		for(int i=0;i<vnum();i++){
			for(int j:nextList(i)){
				if(ord[i]<ord[j]){ //iが親のときのみ調べる（2重に調べるのを防ぐ）
					if(ord[i] < lowlink[j]){
						ans.add(new EdgePair(Math.min(i,j),Math.max(i,j)));
					}
				}
			}
		}
		
		return ans;
	}
	
	//関節点を列挙（昇順）
	public ArrayList<Integer> articulationPoints(){
		int[] ord = new int[vnum()];
		int[] ordidx = new int[vnum()]; //そのオーダーを持つ頂点のインデックス
		int[] lowlink = new int[vnum()];
		Arrays.fill(lowlink, -1);
		
		//DFS木を作り、ordを求める
		ArrayDeque<Integer> a = new ArrayDeque<>();
		a.offerFirst(0);
		int noword = 0;
		boolean isVisited[] = new boolean[vnum()];
		int parent[] = new int[vnum()];
		HashSet<EdgePair> tree = new HashSet<>(); //DFS木に含まれる辺（ここになければ後退辺
		
		while(!a.isEmpty()){
			int now = a.pollFirst();
			
			if(isVisited[now]){
				continue;
			}
			isVisited[now] = true;
			tree.add(new EdgePair(parent[now],now));
			
			ord[now] = noword;
			ordidx[noword] = now;
			noword++;
			
			for(int i:nextList(now)){
				a.offerFirst(i);
				if(!isVisited[i]){
					parent[i] = now;
				}
			}
		}
		
		//後ろからlowlinkを求める
		for(int i=vnum()-1;i>=0;i--){
			int now = ordidx[i];
			int min = i;
			for(int j:nextList(now)){
				if(ord[j]<i){	//jが親
					if(tree.contains(new EdgePair(j,now))){ //後退辺でないなら数えない
						continue;
					}
				}
				if(lowlink[j]!=-1){
					if(min>lowlink[j]){
						min = lowlink[j];
					}
				}
				else{
					if(min>ord[j]){
						min = ord[j];
					}
				}
			}
			lowlink[now] = min;
		}
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		//DFS木の根
		int rootnum = 0;
		rl:for(int i:nextList(0)){
			if(tree.contains(new EdgePair(0,i))){
				rootnum++;
				if(rootnum>=2){
					ans.add(0);
					break rl;
				}
			}
		}
		
		//DFS木の根以外の頂点
		loop:for(int i=1;i<vnum();i++){
			for(int j:nextList(i)){
				if(parent[j]==i){ //jがiの子
					if(ord[i]<=lowlink[j]){
						ans.add(i);
						continue loop;
					}
				}
			}
		}
		
		return ans;
	}
	
	class EdgePair implements Comparable<EdgePair>{
		int a,b;
		
		public EdgePair(int a, int b){
			this.a = a;
			this.b = b;
		}
		
		@Override
		public boolean equals(Object o){
			if(o instanceof EdgePair){
				EdgePair p = (EdgePair) o;
				return (a == p.a && b == p.b)||(a == p.b && b == p.a);
			}
			return super.equals(o);
		}
		
		@Override
		public int compareTo(EdgePair o){
			if(a!=o.a){
				return Integer.compare(a,o.a);
			}
			return Integer.compare(b, o.b);
		}
		
		@Override
		public int hashCode(){
			return (a<<16)+b;
		}
		
	}
	class NodeList extends ArrayList<Integer>{
		private static final long serialVersionUID = -4461479015945373120L;
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
	public int[] nextintArray(int n){
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public long[] nextlongArray(int n){
		long[] a = new long[n];
		for(int i=0;i<n;i++){
			a[i] = nextLong();
		}
		return a;
	}
	public Integer[] nextIntegerArray(int n){
		Integer[] a = new Integer[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public int[][] nextintMatrix(int h, int w){
		int[][] mat = new int[h][w];
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				mat[i][j] = nextInt();
			}
		}
		return mat;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
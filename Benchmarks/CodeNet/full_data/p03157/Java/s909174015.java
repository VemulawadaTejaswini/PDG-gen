import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {
		
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] board = new char[H][W];
		ArrayList<Pair> list = new ArrayList<Pair>();
		for(int i = 0; i < H; i++){
			board[i] = sc.next().toCharArray();
			for(int j = 0; j < W; j++)
				if(board[i][j] == '#') list.add(new Pair(i, j));
		}
		
		long ans = 0;
		int[][] visited = new int[H][W];	
		int index = 0;
		
		for(Pair p : list){
			if(visited[p.y][p.x] != 0) continue;
			index++;
			visited[p.y][p.x] = index;
			int numB = 1;
			int numW = 0;
			Deque<Pair> queue = new ArrayDeque<Pair>();
			queue.addFirst(p);
			
			while(queue.size() != 0){
				Pair q = queue.removeFirst();
				char now = board[q.y][q.x];
				//System.out.println(q.y + " " + q.x);
				
				int[] dy = {0, -1, 0, 1};
				int[] dx = {1, 0, -1, 0};
				for(int i = 0; i < 4; i++){
					if(q.y + dy[i] >= H || q.y + dy[i] < 0) continue;
					if(q.x + dx[i] >= W || q.x + dx[i] < 0) continue;
					if(visited[q.y+dy[i]][q.x+dx[i]] != 0) continue;
					
					char next = board[q.y+dy[i]][q.x+dx[i]];
					if(now == next) continue;
					
					if(next == '.'){
						numW++;
					}else if(next == '#'){
						numB++;
					}
					visited[q.y+dy[i]][q.x+dx[i]] = index;
					
					queue.addLast(new Pair(q.y+dy[i], q.x+dx[i]));
				}
			}
			
			//System.out.println(numB + " " + numW);
			ans += (long)numB * numW;
			
		}
		
		System.out.println(ans);
		
		/*
		for(int i = 0; i < H; i++){
			for(int j = 0; j < W; j++){
				System.out.print(visited[i][j] + " ");
			}
			System.out.println();
		}
		*/
		
	}//end main
	
}//end Main

class UnionFind{
	int[] par;
	int[] rank;
	int group;
	
	UnionFind(int n){
		par = new int[n];
		rank = new int[n];
		group = n;
		for(int i = 0; i < n; i++){
			par[i] = i;
			rank[i] = 0;
		}
	}
	//経路圧縮しながらrootを求める
	int find(int x){
		if(par[x] == x) return x;
		return par[x] = find(par[x]);
	}
	void unite(int x, int y){
		x = find(x);
		y = find(y);
		if(x == y) return;
		group--;
		if(rank[x] > rank[y]) par[x] = y;
		else{
			par[y] = x;
			if(rank[x] == rank[y]) rank[x]++;
		}
	}
	boolean same(int x, int y){
		return find(x) == find(y);
	}
}

class Pair{
	int y; int x;
	public Pair(int y, int x){
		this.x = x;
		this.y = y;
	}
}

class FastScanner {
    private InputStream in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public FastScanner(InputStream in) {
		this.in = in;
	}
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
    private int readByte() {
    	if (hasNextByte()) return buffer[ptr++];
    	else return -1;
    }
    private static boolean isPrintableChar(int c){
    	return 33 <= c && c <= 126;
    }
    public boolean hasNext() {
    	while(hasNextByte() && !isPrintableChar(buffer[ptr]))
    		ptr++; return hasNextByte();
    }
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
    public double nextDouble() {
    	return Double.parseDouble(next());
    }
}

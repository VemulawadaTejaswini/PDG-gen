import static java.lang.System.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Main{
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] maze = new char[h][w];
		for(int i = 0; i < h; i++) {
			maze[i] = sc.next().toCharArray();
		}
		int whiteMass = -1;
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(maze[i][j] == '.')
					whiteMass++;
			}
		}
		Queue<Position> que = new ArrayDeque<>();
		boolean[][] visited = new boolean[h][w];
		int[][] costs = new int[h][w];
		for(int i = 0; i < h; i++)
			Arrays.fill(costs[i], -1);
		que.offer(new Position(0,0));
		costs[0][0] = 0;
		
		while(que.size() > 0) {
			if (costs[h-1][w-1] != -1)
				break;
			Position pos = que.poll();
			int x = pos.x; int y = pos.y;
			visited[y][x] = true;
			//上
			if(y != 0 && maze[y-1][x] == '.' && !visited[y-1][x]) {
				costs[y-1][x] = costs[y][x] + 1;
				que.offer(new Position(y-1,x));
			}			
			//左
			if(x != 0 && maze[y][x-1] == '.' && !visited[y][x-1]) {
				costs[y][x-1] = costs[y][x] + 1;
				que.offer(new Position(y, x-1));
			}
			//下
			if(y != h-1 && maze[y+1][x] == '.' && !visited[y+1][x]) {
				costs[y+1][x] = costs[y][x] + 1;
				que.offer(new Position(y+1, x));
				
			}
			//右
			if(x != w-1 && maze[y][x+1] == '.' && !visited[y][x+1]) {
				costs[y][x+1] = costs[y][x] + 1;
				que.offer(new Position(y, x+1));
			}		
		}
		int ans = whiteMass - costs[h-1][w-1];
		if (costs[h - 1][w -1] == -1)
			ans  = -1;
		
		out.println(ans);
		
		
	}
	static class Position{
		int y;
		int x;
		Position(int y, int x){
			this.y = y;
			this.x = x;			
		}
	}
}
	class FastScanner {
	    private final InputStream in = System.in;
	    private final byte[] buffer = new byte[1024];
	    private int ptr = 0;
	    private int buflen = 0;
	    private boolean hasNextByte(){
	        if(ptr < buflen){
	            return true;
	        }else{
	            ptr = 0;
	            try{
	                buflen = in.read(buffer);
	            }catch(IOException e){
	                e.printStackTrace();
	            }
	            if(buflen <= 0){
	                return false;
	            }
	        }
	        return true;
	    }
	    private int readByte(){
	        if(hasNextByte()) return buffer[ptr++];
	        else return -1;
	    }
	    private boolean isPrintableChar(int c){
	        return 33 <= c && c <= 126;
	    }
	    public boolean hasNext(){
	        while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
	        return hasNextByte();
	    }
	    public String next(){
	        if(!hasNext()) throw new NoSuchElementException();
	        StringBuilder sb = new StringBuilder();
	        int b = readByte();
	        while(isPrintableChar(b)){
	            sb.appendCodePoint(b);
	            b = readByte();
	        }
	        return sb.toString();
	    }
	    public long nextLong(){
	        if(!hasNext()) throw new NoSuchElementException();
	        long n = 0;
	        boolean minus = false;
	        int b = readByte();
	        if(b == '-'){
	            minus = true;
	            b = readByte();
	        }
	        if(b < '0' || '9' < b){
	            throw new NumberFormatException();
	        }
	        while(true){
	            if('0' <= b && b <= '9'){
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
	    public int nextInt(){
	        long nl = nextLong();
	        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
	        return (int) nl;
	    }
	    public double nextDouble(){
	        return Double.parseDouble(next());
	    }
	}




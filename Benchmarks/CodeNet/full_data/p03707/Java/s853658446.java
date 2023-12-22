import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	private static FastScanner sc = new FastScanner();
	static Cell[][] grid;
	static int N;
	static int M;

	public static void main(String[] args) {
		N = sc.nextInt();
		M = sc.nextInt();
		int Q = sc.nextInt();
		
		grid = new Cell[N][M];
		for(int i=0; i<N; i++) {
			char[] temp = sc.next().toCharArray();
			for(int j=0; j<M; j++) {
				grid[i][j] = new Cell();
				grid[i][j].s = temp[j] - '0';
				grid[i][j].r = i;
				grid[i][j].c = j;
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				
			}
		}
		
		StringBuilder ans = new StringBuilder();
		for(int i=0; i<Q; i++) {
			int x1 = sc.nextInt() - 1;
			int y1 = sc.nextInt() - 1;
			int x2 = sc.nextInt() - 1;
			int y2 = sc.nextInt() - 1;
			int group = 0;
			
			for(int j=x1; j<=x2; j++) {
				for(int k=y1; k<=y2; k++) {
					grid[j][k].group = -1;
				}
			}
			
			for(int j=x1; j<=x2; j++) {
				for(int k=y1; k<=y2; k++) {
					if(grid[j][k].s == 1 && grid[j][k].group == -1) {
						grid[j][k].group = group;
						group++;
						grid[j][k].setNumber(x1, y1, x2, y2);
					}
				}
			}
			
			ans.append(group);
			ans.append("\n");
		}
		System.out.print(ans);
	}
	
	static class Cell {
		int r;
		int c;
		int s;
		int group = -1;
		
		void setNumber(int x1, int y1, int x2, int y2) {
//			System.out.println(r + " " + c + " " + group);
			if(r-1 >= 0 && grid[r-1][c].s == 1 && grid[r-1][c].group == -1 && r-1 >= x1) {
				grid[r-1][c].group = group;
				grid[r-1][c].setNumber(x1, y1, x2, y2);
			}
			if(r+1 <= N-1 && grid[r+1][c].s == 1 && grid[r+1][c].group == -1 && r+1 <= x2) {
				grid[r+1][c].group = group;
				grid[r+1][c].setNumber(x1, y1, x2, y2);
			}
			if(c-1 >= 0 && grid[r][c-1].s == 1 && grid[r][c-1].group == -1 && c-1 >= y1) {
				grid[r][c-1].group = group;
				grid[r][c-1].setNumber(x1, y1, x2, y2);
			}
			if(c+1 <= M-1 && grid[r][c+1].s == 1 && grid[r][c+1].group == -1 && c+1 <= y2) {
				grid[r][c+1].group = group;
				grid[r][c+1].setNumber(x1, y1, x2, y2);
			}
		}
	}

	static class FastScanner {
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
	    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
	    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
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
	        return Long.parseLong(next());
	    }
	    public int nextInt(){
	    	return Integer.parseInt(next());
	    }
	}
}

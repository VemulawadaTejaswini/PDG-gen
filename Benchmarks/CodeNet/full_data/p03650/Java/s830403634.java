import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.NoSuchElementException;
 
public class Main {
	private static FastScanner sc = new FastScanner();
	private static Node[] V;
	private static ArrayList<Integer> pstodr = new ArrayList<>();
	private static int groupnum = 0;
	private static int groupsize = 0;
	private static boolean flag = false;
	
	public static void main(String[] args) {
		int N = sc.nextInt();
		
		V = new Node[N];
		for(int i=0; i<N; i++) {
			V[i] = new Node();
			V[i].id = i;
		}
		
		for(int i=0; i<N; i++) {
			int p = sc.nextInt() - 1;
			V[p].nbr.add(i);
			V[i].revnbr.add(p);
		}
		
		V[0].dfs();
		
		for(int i=0; i<N; i++) {
			V[i].visited = false;
		}
		
		for(int i=pstodr.size()-1; i>=0; i--) {
			V[pstodr.get(i)].revdfs();
			groupnum++;
		}
		
		for(int i=0; i<N; i++) {
			V[i].visited = false;
		}
		
		for(int i=pstodr.size()-1; i>=0; i--) {
			flag = true;
			groupsize = 0;
			V[pstodr.get(i)].groupdfs();
			if(flag) {
				if(groupsize == 2 || groupsize == 3) {
					System.out.println("IMPOSSIBLE");
					return;
				}
			}
		}
		
		System.out.println("POSSIBLE");
	}
	
	static class Node {
		int id;
		int group;
		HashSet<Integer> nbr = new HashSet<>();
		HashSet<Integer> revnbr = new HashSet<>();
		boolean visited;
		
		void dfs() {
			visited = true;
			for(int x : nbr) {
				if(!V[x].visited) {
					V[x].dfs();
				}
			}
			pstodr.add(id);
		}
		
		void revdfs() {
			if(visited) {
				return;
			}
			visited = true;
			for(int x : revnbr) {
				if(!V[x].visited) {
					V[x].revdfs();
				}
			}
			group = groupnum;
//			System.out.println(id + " " + group);
		}
		
		void groupdfs() {
			if(visited) {
				return;
			}
			visited = true;
			groupsize++;
			for(int x : nbr) {
				if(V[x].group != group) {
					flag = false;
				}
				if(!V[x].visited) {
					V[x].groupdfs();
				}
			}
		}
	}
	
	static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte() {
            if(ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch(IOException e) {
                    e.printStackTrace();
                }
                if(buflen <= 0) {
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
        public double nextDouble(){
            return Double.parseDouble(next());
        }
    }
}

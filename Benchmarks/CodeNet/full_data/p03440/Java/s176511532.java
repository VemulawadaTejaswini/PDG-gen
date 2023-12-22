import java.io.IOException;
import java.io.InputStream;
import java.util.*;
 
public class Main{
	public static void main(String[] args){
		FastScanner sc = new FastScanner();
		int N = sc.nextInt();
		int M = sc.nextInt();
		if(M==0){
			if(N==1) System.out.println(0);
			else System.out.println("Impossible");
			return;
		}
		
		//グラフの作成
		long[] a = new long[N];
		int[][] edge = new int[M][2];
		for(int i=0;i<N;++i) a[i] = sc.nextLong();
		for(int i=0;i<M;++i){
			edge[i][0] = sc.nextInt();
			edge[i][1] = sc.nextInt();
		}
		
		//森を連結成分に分解
		int[] index = new int[N];
		int num = 0;
		boolean[] used = new boolean[M];
		for(int i=0;i<N;++i) index[i] = -1;
		while(!end(index)){
			int start = 0;
			while(index[start]!=-1)start++;
			ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
			queue.offer(start);
			while(!queue.isEmpty()){
				int siten = queue.poll();
				index[siten] = num;
				for(int i=0;i<M;++i){
					if(!used[i]){
						if(edge[i][0]==siten){
							if(index[edge[i][1]]==-1){
								used[i] = true;
								queue.offer(edge[i][1]);
							}
						}else if(edge[i][1]==siten){
							if(index[edge[i][0]]==-1){
								used[i] = true;
								queue.offer(edge[i][0]);
							}
						}
					}
				}
			}
			num++;
		}
		
		//(連結成分の個数)-1だけ辺を最小コストで追加する
		/*long ans = 0;
		boolean[] usedPoint = new boolean[N];
		boolean[] mori = new boolean[num];
		mori[0] = true;
		for(int i=num-1;i>0;i--){
			long kouho1=Long.MAX_VALUE;
			long kouho2=Long.MAX_VALUE;
			int p1 = -1;
			int p2 = -1;
			for(int j=0;j<N;++j){
				if(!usedPoint[j]&&mori[index[j]]&&a[j]<kouho1){
					kouho1 = a[j];
					p1 = j;
				}
				if(!usedPoint[j]&&!mori[index[j]]&&a[j]<kouho2){
					kouho2 = a[j];
					p2 = j;
				}
			}
			ans += kouho1+kouho2;
			usedPoint[p1]=true;
			usedPoint[p2]=true;
		}*/
		System.out.println(num);
		return;
	}

	public static boolean end(int[] index){
		for(int i=0; i<index.length; ++i){
			if(index[i]==-1) return false;
		}
		return true;
	}
	
	public static void quickSort(long[] a, int from, int to) {
		if (to - from <= 1) {
			return;
		}
		int i = from;
		int j = to - 1;
		long x = a[from + (new Random()).nextInt(to - from)];
		while (i <= j) {
			while (a[i] < x) {
				i++;
			}
			while (a[j] > x) {
				j--;
			}
			if (i <= j) {
				long t = a[i];
				a[i] = a[j];
				a[j] = t;
				i++;
				j--;
			}
		}
		quickSort(a, from, j + 1);
		quickSort(a, j + 1, to);
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
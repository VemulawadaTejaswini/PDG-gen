import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args)throws IOException {
		Main main = new Main();
		main.solve(new FastScanner());
		System.exit(0);
	}

	void solve(FastScanner in) {
		int N = in.nextInt();

		List<List<Integer>> player = new ArrayList<List<Integer>>(N+1);
		for(int i=0;i<=N;i++) {
			player.add(new ArrayList<Integer>(N-1));
		}
		for(int i=1;i<=N;i++) {
			List<Integer> p = player.get(i);
			for(int j=0;j<N-1;j++) {
				p.add(in.nextInt());
			}
			Collections.reverse(p);
		}

		PriorityQueue<Integer> PlanOp = new PriorityQueue <Integer>(N);
		List<Integer> AddL = new ArrayList<Integer>(N);
		Iterator<Integer> iterator;
		int []Listlen = new int[N+1]; // Listのsize
		boolean []yo_f = new boolean[N+1]; // 参照済みのflag
		int []op = new int[N+1]; // Opponent
		Arrays.fill(Listlen, N-1);
		Arrays.fill(op, -1);

		boolean Compete_f = false; // trueならばその日、対戦成立
		int Opponent;
		int Days = 0;

		for(int i=1;i<=N;i++) {
			op[i] = player.get(i).get(0); // 対戦候補を入れる
			PlanOp.add(i);
		}
		while(true) {
			Compete_f = false;

			while(PlanOp.size()>0) {
				int i = PlanOp.poll();
				yo_f[i] = true; // 参照済み
				if(Listlen[i] <= 0)continue;    // Listのsize <= 0
				Opponent = op[i];
				if(Opponent == -1 || yo_f[Opponent]) continue; // 参照済み
				if(op[Opponent] == i) { // 対戦成立
					//out.println(i+ "   vs  "+ Opponent);

					op[Opponent] = -1; // 成立済み
					op[i] = -1;
					yo_f[Opponent] = true; // 参照済み
					player.get(i).remove(0);
					player.get(Opponent).remove(0);
					Listlen[i]--;
					Listlen[Opponent]--;
					Compete_f = true;

					if(Listlen[i]>0 && op[i] == -1) {
						AddL.add(i);
					}

					if(Listlen[Opponent]>0 && op[Opponent] == -1) {
						AddL.add(Opponent);
					}
				}
			}

			if(!Compete_f) {
				for(int i=1;i<=N;i++) {
					if(Listlen[i]>0) {
						Days = -1;
						break;
					}
				}
				break;
			}

			if(Compete_f) {
				iterator = AddL.iterator();
				while (iterator.hasNext()) {
				    int i = iterator.next();
				    op[i] = player.get(i).get(0);
				    PlanOp.add(i);
				}
				AddL.clear();
			}

			Arrays.fill(yo_f, false);
			Days++;
		}

		System.out.println(Days);
	}

	long gcd(long m,long n) {
		if (m<n) return gcd(n,m);
		if (n==0)return m;
		return gcd(n,m%n);
	}

}

// @p_shiki37
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
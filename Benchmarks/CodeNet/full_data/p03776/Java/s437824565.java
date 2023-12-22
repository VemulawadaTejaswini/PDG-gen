import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;

public class Main {
	int N,A,B;
	long[] v;
	HashMap<Long,Integer> map;


	public long nCk(long n,long k)
	{
		long r = 1;
		for(long i = 1;i <= k;i++,n--){
			r *= n;
			r /= i;
		}
		return r;
	}

	public void solve() {
		N = nextInt();
		A = nextInt();
		B = nextInt();

		v = new long[N];
		for(int i = 0;i < N;i++){
			v[i] = nextLong();
		}

		Arrays.sort(v);
		for(int i = 0;i < N / 2;i++){
			long tmp = v[i];
			v[i] = v[N-i-1];
			v[N-i-1] = tmp;
		}

		ArrayList<Integer> list = new ArrayList<Integer>();
		double max = 0.0;
		for(long i = A;i <= B;i++){
			double sum = 0;
			for(int j = 0;j < i;j++){
				sum += v[j]*1.0;
			}
			if(max < sum/i){
				max = sum/i;
			}
		}

		for(int i = A;i <= B;i++){
			long sum = 0;
			for(int j = 0;j < i;j++){
				sum += v[j];
			}
			if(max == sum*1.0/i){
				list.add(i);
			}
		}

		map = new HashMap<Long,Integer>();
		for(int j = 0;j < N;j++){
			map.put(v[j],map.containsKey(v[j]) ? map.get(v[j]) + 1 : 1);
		}


		long ans = 0;
		for(int i = 0;i < list.size();i++){
			HashMap<Long,Integer> use = new HashMap<Long,Integer>();
			for(int j = 0;j < list.get(i);j++){
				use.put(v[j],use.containsKey(v[j]) ? use.get(v[j]) + 1 : 1);
			}

			long sum = 1L;
			for(long key : use.keySet()){
				sum *= nCk(map.get(key),use.get(key));
			}
			ans += sum;
		}
		out.println(String.format("%.09f",max));
		out.println(ans);
	}

	public static void main(String[] args) {
		out.flush();
		new Main().solve();
		out.close();
	}

	/* Input */
	private static final InputStream in = System.in;
	private static final PrintWriter out = new PrintWriter(System.out);
	private final byte[] buffer = new byte[2048];
	private int p = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (p < buflen)
			return true;
		p = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (buflen <= 0)
			return false;
		return true;
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrint(buffer[p])) {
			p++;
		}
		return hasNextByte();
	}

	private boolean isPrint(int ch) {
		if (ch >= '!' && ch <= '~')
			return true;
		return false;
	}

	private int nextByte() {
		if (!hasNextByte())
			return -1;
		return buffer[p++];
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = -1;
		while (isPrint((b = nextByte()))) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
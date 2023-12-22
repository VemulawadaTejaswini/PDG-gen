import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		ContestScanner scan = new ContestScanner();

		final int N = scan.nextInt();
		final int K = scan.nextInt();

		int[] D = new int[K];

		for(int i=0; i < K; i++) D[i] = scan.nextInt();

		(new Solve(N, K, D)).solve();
	}
}

class Solve {
	private final int N;
	private final int K;

	private final int[] D;

	public Solve(final int N, final int K, final int[] D)
	{
		this.N = N;
		this.K = K;
		this.D = D;
	}

	public void solve()
	{
		int answer = 0;
		int _N = N;

		for(int r=1; _N > 0; r = r * 10)
		{
			int x = _N % 10;

			int j;

			do {
				for(j=0; j < K; j++)
				{
					if(D[j] == x)
					{
						x++;
						break;
					}
				}
			} while(j < K);

			_N = _N / 10;

			if(x == 10) _N++;

			x = x % 10;

			answer += x * r;
		}

		System.out.println(answer);
	}
}
class ContestScanner {
	BufferedReader reader;
	String[] line;
	int index;
	public ContestScanner() {
		reader = new BufferedReader(new InputStreamReader(System.in));
	}

	public ContestScanner(String filename) throws FileNotFoundException {
		reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
	}

	public String nextToken() throws IOException {
		if(line == null || index >= line.length)
		{
			line = reader.readLine().trim().split(" ");
			index = 0;
		}

		return line[index++];
	}

	public String next() throws IOException {
		return nextToken();
	}

	public String readLine() throws IOException {
		line = null;
		index = 0;

		return reader.readLine();
	}

	public int nextInt() throws IOException, NumberFormatException {
		return Integer.parseInt(nextToken());
	}

	public long nextLong() throws IOException, NumberFormatException {
		return Long.parseLong(nextToken());
	}

	public double nextDouble() throws IOException, NumberFormatException {
		return Double.parseDouble(nextToken());
	}

	public int[] nextIntArray(int N) throws IOException, NumberFormatException {
		int[] result = new int[N];

		for(int i=0; i < N; i++) result[i] = nextInt();

		return result;
	}

	public long[] nextLongArray(int N) throws IOException, NumberFormatException {
		long[] result = new long[N];

		for(int i=0; i < N; i++) result[i] = nextLong();

		return result;
	}

	public double[] nexDoubleArray(int N) throws IOException, NumberFormatException {
		double[] result = new double[N];

		for(int i=0; i < N; i++) result[i] = nextDouble();

		return result;
	}
}

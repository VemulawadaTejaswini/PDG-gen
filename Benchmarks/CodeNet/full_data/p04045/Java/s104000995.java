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
		int rank;

		for(rank=1; rank <= N; rank = rank*10);

		rank = rank / 10;

		boolean change = false;
		boolean backtrack = false;

		int r=rank;

		int x = (N % (r * 10)) / r;

		while((!change || backtrack) && r > 0)
		{
			int j = 0;

			backtrack = false;

			do {
				for(j=0; j < K; j++)
				{
					if(D[j] == x)
					{
						x++;
						change = true;
						break;
					}
				}
				if(x > 9) backtrack = true;
			} while(j < K && !backtrack);

			if(backtrack)
			{
				r = r * 10;
				x = (answer % 10 + 1);
				answer = answer / 10;
			}
			else
			{
				r = r / 10;

				answer = answer * 10 + x;

				if(r == 0) break;

				x = (N % (r * 10)) / r;
			}
		}

		if(change)
		{
			for(; r > 0; r = r / 10)
			{
				int y = 0;

				int j = 0;

				do {
					for(j=0; j < K; j++)
					{
						if(D[j] == y)
						{
							y++;
							break;
						}
					}
				} while(j < K);

				answer = answer * 10 + y;
			}
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

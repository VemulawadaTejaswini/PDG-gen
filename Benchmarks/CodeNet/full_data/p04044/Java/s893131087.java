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
		final int L = scan.nextInt();

		String[] S = new String[N];

		for(int i=0; i < N; i++) S[i] = scan.next();

		(new Solve(N, L, S)).solve();
	}
}

class Solve {
	private final int N;
	private final int L;

	private final String[] S;

	public Solve(final int N, final int L, final String[] S)
	{
		this.N = N;
		this.L = L;
		this.S = S;
	}

	public void solve()
	{
		String[] S = (String[])this.S.clone();

		Arrays.sort(S);

		StringBuilder sb = new StringBuilder();

		for(int i=0; i < N; i++) sb.append(S[i]);

		System.out.println(sb.toString());
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

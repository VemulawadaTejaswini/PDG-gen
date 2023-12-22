import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		int[] d = new int[N];
		for(int i=0; i<N; i++)d[i] = sc.nextInt();
		Arrays.sort(d);
		out.println(d[N/2] - d[N/2-1]);

		out.flush();
	}
}

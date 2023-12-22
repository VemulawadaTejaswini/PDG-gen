import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] X = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++)
			X[i] = Integer.parseInt(st.nextToken());
		
		int min = Integer.MAX_VALUE;
		
		for(int p=1; p<100; p++) {
			int ans = 0;
			for(int i=0; i<N; i++)
				ans += (int)Math.pow(X[i] - p, 2);
			min = Math.min(ans, min);
		}
		
		System.out.println(min);
	}

}
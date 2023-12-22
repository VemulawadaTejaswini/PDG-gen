import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++)
			A[i] = Integer.parseInt(st.nextToken());
		
		String ans = "YES";
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				if(A[i] == A[j]) {
					ans = "NO";
					break;
				}
			}
		}
		
		System.out.println(ans);
	}

}
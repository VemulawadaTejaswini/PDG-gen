import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] words = br.readLine().split("\\s+");
		int[] P = new int[N];
		
		for(int i=0;i<N;i++) {
			P[i] = Integer.parseInt(words[i]);
		}
		int res = 1;
		for(int i=1;i<N;i++) {
			boolean flag = true;
			for(int j=0;j<i&&flag;j++) {
				if( P[j] < P[i]) {
					flag = false;
					break;
				}
			}
			if( flag ) {
				res++;
			}
		}
		System.out.println(res);
		
	}
}

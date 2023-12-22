import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N,K;
	static int arr[];
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		br.close();
		arr = new int[N];
		for(int i= 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int zero = N;
		for(int i= 0; i < N; i++) {
			if(arr[i] >= 0) {
				zero = i;
				if(arr[i] == 0) {
					K--;
				}
				break;
			}
		}
		int min = 300000000;
		int tempmin;
		for(int i = 0 ; i <= K && i <= zero; i++) {
			if((zero-1+K-i) >= N) {
				continue;
			}
			int left = 0; 
			int right = 0;
			if(i > 0) {
				left = arr[zero-i]*(-1);
			}
			if(K-i > 0) {
				right = arr[zero-1+K-i];
			}
			tempmin = Math.min(left+2*right, 2*left+right);
			min = Math.min(min, tempmin);
			
		}
		System.out.println(min);
	}
	
	
}
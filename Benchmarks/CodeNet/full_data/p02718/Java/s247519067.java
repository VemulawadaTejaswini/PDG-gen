import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(bfr.readLine());
		int N = Integer.parseInt(str.nextToken());
		int M = Integer.parseInt(str.nextToken());
		str = new StringTokenizer(bfr.readLine());
		int[] arr = new int[N];
		int sum = 0;
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(str.nextToken());
			sum+=arr[i];
		}
		Arrays.sort(arr);
		for(int i=N-1; i>(N-1)-M; i--) {
			if(arr[i]<(sum/(4*M))) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

}

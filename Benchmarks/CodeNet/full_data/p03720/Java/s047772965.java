import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		int[] count = new int[n+1];
		for(int i = 0; i < n+1; i++){
			count[i] = 0;
		}
		for(int i = 2; i < 2*(m + 1); i++){
			int idx = Integer.parseInt(input[i]);
			count[idx]++;
		}
		for(int i = 1; i<n+1; i++){
			System.out.println(count[i]);
		}
		br.close();
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nm = br.readLine().split(" ");
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);
		int[][] a = new int[m][2];
		int[] num = new int[55];
		for(int i=0;i<m;i++) {
			String[] ab = br.readLine().split(" ");
			num[Integer.parseInt(ab[0])]++;
			num[Integer.parseInt(ab[1])]++;
		}
		for(int i=1;i<=n;i++) {
			System.out.println(num[i]);
		}
	}
}




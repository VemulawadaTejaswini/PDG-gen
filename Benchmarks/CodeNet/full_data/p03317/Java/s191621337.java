import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] tmp = br.readLine().split(" ");
		int n        = Integer.parseInt(tmp[0]);
		double k     = Double.parseDouble(tmp[1]);
		int cnt      = 0;
		int min      = Integer.MAX_VALUE;
		String[] tm2 = br.readLine().split(" ");
		int[] list   = new int[n];


		cnt = 1 + (int)Math.ceil((n - k) / (k - 1.0)) ;


		System.out.println(cnt);
	}
}

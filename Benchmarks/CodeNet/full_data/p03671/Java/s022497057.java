import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			String[] s = str.split(" ",0);
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			int c = Integer.parseInt(s[2]);
			int[] x = new int[3];
			x[0] = a + b;
			x[1] = a + c;
			x[2] = b + c;
			Arrays.sort(x);
			System.out.println(x[0]);

		}catch (Exception e) {
			System.exit(0);
		}
	}
}

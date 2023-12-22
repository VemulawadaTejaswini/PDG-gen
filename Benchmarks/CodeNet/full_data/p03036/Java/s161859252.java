import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");
		int r = Integer.parseInt(tmp[0]);
		int D = Integer.parseInt(tmp[1]);
		long x = Integer.parseInt(tmp[2]);

		for(int i = 1;i<=10;i++){
			x = r*x - D;
			System.out.println(x);
		}
	}
}

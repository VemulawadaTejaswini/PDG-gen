
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		String[] str = num.split(" ", 0);
		int k = Integer.parseInt(str[0]);
		int c = Integer.parseInt(str[1]);
		k--;
		c--;
		System.out.println(c*k);
	}
}

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		String[] str = num.split(" ", 0);
		int n = Integer.parseInt(str[0]);
		int a = Integer.parseInt(str[1]);
		int b = Integer.parseInt(str[2]);
		int x = n - a;
		int y = n - b;
		Math.abs(x);
		Math.abs(y);
		if (x < y) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}
	}
}
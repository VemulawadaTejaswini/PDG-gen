
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int[][] memo;

	public static int hoge(int current, int n, String last) {
		return 0;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int a,e,k;
		String str;
		str = bf.readLine();
		a = Integer.parseInt(str);
		str = bf.readLine();
		str = bf.readLine();
		str = bf.readLine();
		str = bf.readLine();
		e = Integer.parseInt(str);
		str = bf.readLine();
		k = Integer.parseInt(str);
		if(e-a <= k) {
			System.out.println("Yay!");
		} else {
			System.out.println(":(");
		}
	}
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		if(N <1000) {
			System.out.println("ABC");
		} else if(N > 999) {
			System.out.println("ABD");
		}
	}
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int a,b,ans;
		String str;
		String[] s;
		str = bf.readLine();
		s = str.split(" ");
		a = Integer.parseInt(s[0]);
		b = Integer.parseInt(s[1]);
		if(a > b) {
			ans = 2*a-1;
		} else if(a < b) {
			ans = 2*b-1;
		} else {
			ans = 2*a;
		}
		System.out.println(ans);
	}
}
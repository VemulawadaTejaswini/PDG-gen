import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		String[] inputS = new String[3];
		Long a, b, c, n, ans = (long) 0;
		boolean poisoned = false;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8))) {
			inputS = br.readLine().split(" ");
			a = Long.valueOf(inputS[0]);
			b = Long.valueOf(inputS[1]);
			c = Long.valueOf(inputS[2]);
			n = a + b + c;
		}
		while(true) {
			if(!poisoned && c > 0) {
				c--;
				ans++;
				poisoned = true;
			} else if(b > 0) {
				b--;
				ans++;
				poisoned = false;
			} else if(c > 0 && a > 0) {
				a--;
				poisoned = false;
			} else {
				break;
			}
			n--;
			if(n == 0) {
				break;
			}
		}
		System.out.println(ans);
	}
}
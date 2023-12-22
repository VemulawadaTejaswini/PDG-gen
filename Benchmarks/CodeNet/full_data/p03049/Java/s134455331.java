import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		int n = Integer.parseInt(line);
		int ans = 0;
		int Acount  =0;
		int Bcount = 0;
		for (int i = 0; i < n; i++) {
			String[] str = reader.readLine().split("");
			if (str[str.length-1].equals("A")) {
				Acount++;
			}
			if (str[0].equals("B")) {
				Bcount++;
			}
			for (int k = 0; k < str.length; k++) {
				if (str[k].equals("A") && k < str.length-1 && str[k+1].equals("B")) {
					ans++;
				}
			}
		}
		ans += Math.min(Acount, Bcount);
		System.out.println(ans);
	}
}
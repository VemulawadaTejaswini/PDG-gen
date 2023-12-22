import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		int n = Integer.parseInt(line);
		int ans = 0;
		int Acount = 0;
		int Bcount = 0;
		boolean[] Aflag  = new boolean[n];
		boolean[] Bflag = new boolean[n];
		boolean final_flag = false;
		for (int i = 0; i < n; i++) {
			String[] str = reader.readLine().split("");
			if (str[str.length-1].equals("A")) {
				Aflag[i] = true;
				Acount++;
			}
			if (str[0].equals("B")) {
				Bflag[i] = true;
				Bcount++;
			}
			for (int k = 0; k < str.length; k++) {
				if (str[k].equals("A") && k < str.length-1 && str[k+1].equals("B")) {
					ans++;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			if ((Aflag[i] && !Bflag[i]) || (!Aflag[i] && Bflag[i])) {
				final_flag = true;
			}
		}
		if (final_flag) {
			ans += Math.min(Acount, Bcount);
		}
		else {
			ans += Math.max(Math.min(Acount, Bcount) - 1, 0);
		}
		System.out.println(ans);
	}
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int n,q,l,r,ans;
		String str;
		String[] s,stemp;
		str = bf.readLine();
		stemp = str.split(" ");
		n = Integer.parseInt(stemp[0]);
		q = Integer.parseInt(stemp[1]);
		str = bf.readLine();
		s = str.split("");
		for(int i = 0;i < q;++i) {
			str = bf.readLine();
			stemp = str.split(" ");
			l = Integer.parseInt(stemp[0]);
			r = Integer.parseInt(stemp[1]);
			ans = 0;
			for(int j = l-1;j < r-1;++j) {
				if(s[j].equals("A")) {
					if(s[j+1].equals("C")) {
						ans++;
					}
				}
			}
			System.out.println(ans);
		}
	}
}
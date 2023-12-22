
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int n,ans = 0,temp = 0;
		int[] h;
		String str;
		String[] s;
		str = bf.readLine();
		n = Integer.parseInt(str);
		h = new int[n];
		str = bf.readLine();
		s = str.split(" ");
		for(int i = 0;i < n;++i) {
			h[i] = Integer.parseInt(s[i]);
			if(h[i] >= temp) {
				temp = h[i];
				ans++;
			}
		}
		System.out.println(ans);
	}
}
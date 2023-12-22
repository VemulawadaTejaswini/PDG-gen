import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException, Exception{
		BufferedReader st = new BufferedReader(new InputStreamReader(System.in));
		String t = getStr(st);
		String[] t1 = t.split("");
		t = getStr(st);
		String[] t2 = t.split("");
		int ans = 0;
		for (int i=0;i<3;i++) {
			if(t1[i].equals(t2[i])) {
				ans++;
			}
		}
		anser(ans);
	}

	private static String getStr(BufferedReader st) throws Exception, IOException {
		String str = st.readLine();
		return str;
	}

	private static void anser(int num) {
		System.out.println(num);
	}
}

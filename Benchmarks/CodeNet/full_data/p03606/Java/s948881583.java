import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			int N = Integer.parseInt(str);
			int count = 0;
			for(int i = 0;i < N ;i++) {
				str = br.readLine();
				String[] s = str.split(" ",0);
				int l = Integer.parseInt(s[0]);
				int r = Integer.parseInt(s[1]);
				count += (r - l + 1);
			}
			System.out.println(count);
//			long max  = 1000000007;
		}catch (Exception e) {
			System.exit(0);
		}
	}

}

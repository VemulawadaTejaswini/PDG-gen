import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			String[] s = str.split(" ",0);
			int g = Integer.parseInt(s[1]);
			int b = Integer.parseInt(s[2]);
			if((g*10+b)%4 == 0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
//			long max  = 1000000007;
		}catch (Exception e) {
			System.exit(0);
		}
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			String[] s = str.split(" ",0);
			int N = Integer.parseInt(s[0]);
			int K = Integer.parseInt(s[1]);
			int total = 0;
			for(int i = 0; i < N;i++) {
				str = br.readLine();
				s = str.split(" ",0);
				int a = Integer.parseInt(s[0]);
				int b = Integer.parseInt(s[1]);
				total += b;
				if(total >= K) {
					System.out.println(a);
					break;
				}
			}
//			long max  = 1000000007;
		}catch (Exception e) {
			System.exit(0);
		}
	}
}

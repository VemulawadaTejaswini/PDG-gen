import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			String[] s = str.split(" ",0);
			int x = Integer.parseInt(s[0]);
			int a = Integer.parseInt(s[1]);
			int b = Integer.parseInt(s[2]);
			if(b <= a) {
				System.out.println("delicious");
			}else if(b <= (x+a)) {
				System.out.println("safe");
			}else {
				System.out.println("dangerous");
			}

		}catch (Exception e) {
			System.exit(0);
		}
	}
}

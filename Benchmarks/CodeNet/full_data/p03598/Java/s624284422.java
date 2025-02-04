import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			int N = Integer.parseInt(str);
			str = br.readLine();
			int K = Integer.parseInt(str);
			str = br.readLine();
			String[] s = str.split(" ",0);
			int total = 0;
			for (int i = 0; i < s.length; i++) {
				int x = Integer.parseInt(s[i]);
				int dis = Math.min(x, K-x);
				total += dis;
			}
			
 
			System.out.println(total * 2);
		}catch (Exception e) {
			System.exit(0);
		}
	
	}
 
}

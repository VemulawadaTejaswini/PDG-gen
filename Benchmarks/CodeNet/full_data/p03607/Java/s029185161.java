import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			int N = Integer.parseInt(str);
			HashSet<String> hs = new HashSet<String> ();
			for(int i = 0;i < N ;i++) {
				str = br.readLine();
				if(hs.contains(str)) {
					hs.remove(str);
				}else {
					hs.add(str);
				}

			}
			System.out.println(hs.size());
//			long max  = 1000000007;
		}catch (Exception e) {
			System.exit(0);
		}
	}

}

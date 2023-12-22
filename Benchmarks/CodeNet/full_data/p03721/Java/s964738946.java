
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nmi = br.readLine();
		String[] nm = nmi.split(" ");
		int n = Integer.parseInt(nm[0]);
		int k = Integer.parseInt(nm[1]);
		long index = 0;
		int ans = 0;
		boolean flag = true;
		for(int i=0;i<n;i++) {
			String ini = br.readLine();
			String in[] = ini.split(" ");
			int a = Integer.parseInt(in[0]);
			index += Integer.parseInt(in[1]);
			if(index>=k && flag) {
				flag = false;
				ans = a;
			}
		}
		System.out.println(ans);
	}
}




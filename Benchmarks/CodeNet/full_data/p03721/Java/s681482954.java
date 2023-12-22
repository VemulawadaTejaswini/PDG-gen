
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nm = br.readLine().split(" ");
		int n = Integer.parseInt(nm[0]);
		int k = Integer.parseInt(nm[1]);
		int a[] = new int[n];
		int b[] = new int[n];
		int index = 0;
		int ans = 0;
		boolean flag = true;
		for(int i=0;i<n;i++) {
			String in[] = br.readLine().split(" ");
			a[i] = Integer.parseInt(in[0]);
			index += Integer.parseInt(in[1]);
			if(index>=k && flag) {
				flag = false;
				ans = a[i];
			}
		}
		System.out.println(ans);
	}
}




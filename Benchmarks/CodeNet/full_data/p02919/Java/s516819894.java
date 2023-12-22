import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException, Exception{
		BufferedReader st = new BufferedReader(new InputStreamReader(System.in));
		int n = getInt(st);
		String[] strData = st.readLine().split(" ");
		int ans = 0;
		for(int l=0;l<n-1;l++) {
			int a = Integer.parseInt(strData[l]);
			int max = a;
			int ne = a;
			for(int r=l+1;r<n;r++) {
				int b = Integer.parseInt(strData[r]);
				if (max < b) {
					ne = max;
					max = b;
				} else if(ne < b){
					ne = b;
				} else if(ne == max) {
					ne = b;
				}
				ans+=ne;
			}
		}
		anser(ans);
	}

	private static int getInt(BufferedReader st) throws Exception, IOException {
		int num = Integer.parseInt(st.readLine());
		return num;
	}

	private static void anser(int num) {
		System.out.println(num);
	}
}
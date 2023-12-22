
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void f(int i,int n, int[] b,int til) {
		for(int j = i;j >= til;--j) {
			if(b[j] == n) {
				System.out.println(n);
				if(j != i) {
					f(i,n+1,b,j+1);
				}
				i = j;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int n,ans = 0;
		int[] b;
		String str;
		str = bf.readLine();
		n = Integer.parseInt(str);
		b = new int[n];
		str = bf.readLine();
		String[] s = str.split(" ");
		for(int i = 0;i < n;++i) {
			b[i] = Integer.parseInt(s[i]);
		}
		for(int i = 0;i < n;++i) {
			if(b[i] > i+1) {
				ans = -1;
			}
		}
		if(ans != -1) {
			f(n-1,1,b,0);
		} else {
			System.out.println(ans);
		}
	}
}
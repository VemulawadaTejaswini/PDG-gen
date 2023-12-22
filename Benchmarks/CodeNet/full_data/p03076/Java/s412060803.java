
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int[][] memo;

	public static int hoge(int current, int n, String last) {
		return 0;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int ans = 0,k = 0,temp = 10;
		int[] a = new int[5],b = new int[5];
		String str;
		str = bf.readLine();
		a[0] = Integer.parseInt(str);
		str = bf.readLine();
		a[1] = Integer.parseInt(str);
		str = bf.readLine();
		a[2] = Integer.parseInt(str);
		str = bf.readLine();
		a[3] = Integer.parseInt(str);
		str = bf.readLine();
		a[4] = Integer.parseInt(str);
		for(int i = 0;i < 5;++i) {
			b[i] = a[i]%10;
			if(b[i] < temp && b[i] != 0) {
				temp = b[i];
				k = i;
			}
			a[i] /= 10;
		}
		for(int i = 0;i < 5;++i) {
			if(k == i) {
				continue;
			}
			if(b[i] == 0) {
				ans += a[i]*10;
			} else {
				ans += (a[i]+1)*10;
			}
		}
		ans += a[k]*10 + b[k];
		System.out.println(ans);
	}
}
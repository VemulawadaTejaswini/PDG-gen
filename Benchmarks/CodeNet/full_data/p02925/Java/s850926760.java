
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int ans = 0,n,end = 0,temp;
		int[][] a;
		int[] anum;
		boolean[] atemp;
		boolean exist = false;
		String str;
		String[] s;
		str = bf.readLine();
		n = Integer.parseInt(str);
		a = new int[n][n-1];
		anum = new int[n];
		for(int i = 0;i < n;++i) {
			str = bf.readLine();
			s = str.split(" ");
			for(int j = 0;j < n-1;++j) {
				a[i][j] = Integer.parseInt(s[j])-1;
			}
		}
		while(end < n) {
			exist = false;
			atemp = new boolean[n];
			for(int i = 0;i < n;++i) {
				if(anum[i] == n-1) {
					continue;
				}
				if(!atemp[i]) {
					temp = a[i][anum[i]];
					if(temp < i) {
						continue;
					}
					if(anum[temp] == n-1) {
						continue;
					}
					if(a[temp][anum[temp]] == i) {
						anum[temp]++;
						atemp[temp] = true;
						anum[i]++;
						atemp[i] = true;
						if(anum[temp] == n-1) {
							end++;
						}
						if(anum[i] == n-1) {
							end++;
						}
						exist = true;
					}
				}
			}
			if(!exist) {
				ans = -1;
				break;
			}
			ans++;
		}
		System.out.println(ans);
	}
}
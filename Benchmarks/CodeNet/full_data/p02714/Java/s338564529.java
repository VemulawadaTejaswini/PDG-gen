import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		char s[] = sc.next().toCharArray();
		int rgbsum[][] = new int[3][n+1];
		int is[] = new int[n];
		for(int i=0; i<n; i++) {
			int c = s[i];
			rgbsum[0][i+1] = rgbsum[0][i] + (c=='R' ? 1 : 0);
			rgbsum[1][i+1] = rgbsum[1][i] + (c=='G' ? 1 : 0);
			rgbsum[2][i+1] = rgbsum[2][i] + (c=='B' ? 1 : 0);
			if(c=='R') is[i]=0;
			if(c=='G') is[i]=1;
			if(c=='B') is[i]=2;
		}
		int ans = 0;
		for(int i=0; i<n-2; i++) {
			int c1 = is[i];
			for(int j=i+1; j<n-1; j++) {
				int c2 = is[j];
				if(c1 == c2) continue;
				int id = 3 - c1 - c2;
				int omit = j-i;
				if(j+1+omit>n) {
					ans += rgbsum[id][n]  - rgbsum[id][j+1];
				}else if(j+1+omit == n){
					ans += rgbsum[id][n-1] - rgbsum[id][j+1];
				}else {
					ans += rgbsum[id][n]  - rgbsum[id][j+1+omit] + rgbsum[id][j+1+omit-1] - rgbsum[id][j+1];
				}

			}
		}
		System.out.println(ans);
		sc.close();
	}




}

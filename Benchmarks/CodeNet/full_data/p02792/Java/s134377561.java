
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = 0;
		for(int i = 1; i <= n; i++) {
			int atop, alast;
			alast = i % 10;
			int tmp = i;
			while(tmp >= 10) {
				tmp /= 10;
			}
			atop = tmp;
			if(alast != 0) {
				for(int j = 0; j < n; j++) {
					if(j == 0 && atop == alast && atop <= n) {
						ans++;
					} else if(j > 0) {
						int bmin = alast;
						bmin *= Math.pow(10, j - 1);
						bmin *= 10;
						bmin += atop;
						int bmax = alast;
						for(int k = 0; k < j - 1; k++) {
							bmax *= 10;
							bmax += 9;
						}
						bmax *= 10;
						bmax += atop;
						if(bmax <= n) {
							ans += Math.pow(10, j - 1);
						} else if(bmin <= n && bmax > n) {
							int b = n;
							while(b % 10 != atop) {
								b--;
							}
							b -= alast * Math.pow(10, j);
							b /= 10;
							ans += b + 1;
							break;
						} else {
							break;
						}
					}
				}
			}
		}
		System.out.println(ans);
	}

}

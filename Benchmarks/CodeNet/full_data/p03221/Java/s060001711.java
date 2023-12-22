
import java.util.Scanner;

public class Main {

	public static int digit(int n) {
		int tmp = n;
		int count = 0;
		while(tmp != 0) {
			tmp /= 10;
			++count;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m, n;
		
		n = sc.nextInt();
		m = sc.nextInt();
		int p[], y[], y2[][], count[], ans[][], ans2[][];
		
		p = new int[m];
		y = new int[m];
		y2 = new int[n][m];
		ans = new int[n][m];
		ans2 = new int[m][2];
		count = new int[m];
		
		for(int i = 0; i < m; ++i) {
			p[i] = sc.nextInt();
			y[i] = sc.nextInt();
			y2[p[i] - 1][count[p[i]]] = y[i];
			ans[p[i] - 1][count[p[i]]] = i;
			ans2[i][0] = p[i];
			ans2[i][1] = count[p[i]] + 1;
			++count[p[i]];
		}
		
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < count[p[i]]; ++j) {
				for(int k = j + 1; k < count[p[i]]; ++k) {
					if(y2[i][j] > y2[i][k]) {
						int tmp = y2[i][j];
						y2[i][j] = y2[i][k];
						y2[i][k] = tmp;
						tmp = ans2[ans[i][j]][1];
						ans2[ans[i][j]][1] = ans2[ans[i][k]][1];
						ans2[ans[i][k]][1] = tmp;
					}
				}
			}
		}
		
		for(int i = 0; i < m; ++i) {
			for(int j = 0; j < 6 - digit(ans2[i][0]); ++j) {
				System.out.print(0);
			}
			System.out.print(ans2[i][0]);
			for(int j = 0; j < 6 - digit(ans2[i][1]); ++j) {
				System.out.print(0);
			}
			System.out.println(ans2[i][1]);
		}
		
		sc.close();
	}

}

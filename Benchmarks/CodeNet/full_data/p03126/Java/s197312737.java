import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] a = new int[n][m];
		int[] numoflover = new int[m];
		int answer = 0;
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			for(int j = 0; j < num; j++) {
				a[i][j] = sc.nextInt();
				for(int k = 0; k < m; k++)
					if(a[i][j] == k+1)
						numoflover[k] += 1;
			}
		}
		for(int j = 0; j < m; j++)
			if(numoflover[j] == n) answer += 1;
		System.out.println(answer);
	}

}
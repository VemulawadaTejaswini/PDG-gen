import java.util.*;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		double[][]  pos = new double[n][d];
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < d; j++) {
				pos[i][j] = sc.nextDouble();
			}
		}
		//double[][] dist = new double[n][n];
		int cnt = 0;
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				double num = 0;
				for(int k = 0; k < d; k++) {
					num +=( pos[i][k] - pos[j][k]) * (pos[i][k] - pos[j][k]);
				}
				num = Math.sqrt(num);
				if( ((int)num - num) == 0)
					cnt++;
			}
		}
		out.println(cnt);
	}
}
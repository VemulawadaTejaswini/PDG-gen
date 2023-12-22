import java.util.Scanner;
public class Main {
	public static void  main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int d = s.nextInt();
		int i,j;
		int ans=0;
		int[][] x = new int[n][d];
		for(i = 0;i<n;i++) {
			for(j=0;j<d;j++) {
				x[i][j] = s.nextInt();
			}
		}
		for(int k=0;k<n;k++) {
			for(i=0;i<n-k-1;i++) {
			double sum =0;
				for(j=0;j<d;j++) {
					sum += Math.pow(x[k][j] - x[n-i-1][j], 2);
				}
				sum = Math.sqrt(sum);
				if(sum - (int)sum == 0) ans++;
			}
		}
		System.out.println(ans);
		s.close();
    }
}
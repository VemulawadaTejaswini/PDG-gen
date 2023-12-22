import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p[][] = new int[10][10];
		for(int i=1;i<=n;i++) {
			String s = Integer.toString(i);
			int l = s.charAt(0)-'0';
			int r = s.charAt(s.length()-1) - '0';
			p[r][l]++;
		}
		long ans = 0;
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				ans += p[i][j] * p[j][i];
			}
		}
		System.out.println(ans);
	}
 
}
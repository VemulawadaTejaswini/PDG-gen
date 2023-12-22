import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int k2 = 2*k;
		int[][] mat = new int[4*k-1][4*k-1];
		
		for (int i=0;i<n;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			String s = sc.next();
			if (s.equals("W"))
				y += k;
			x %= k2;
			y %= k2;
			
			for (int a=0;a<4;a++) {
				int c = x + a*k;
				if (c>=mat.length)
					break;
				for (int b=0;b<4;b++) {
					int r = y + b*k;
					if (r>=mat.length)
						break;
					int sign = ((a^b)&1)==1 ? -1 : 1;
					mat[c][r] += sign * ((a==0||b==0) ? 1 : 2);
				}
			}
		}
		
		for (int c=0;c<mat.length;c++) {
			for (int r=1;r<mat.length;r++) {
				mat[c][r] += mat[c][r-1];
			}
		}
		for (int r=0;r<mat.length;r++) {
			for (int c=1;c<mat.length;c++) {
				mat[c][r] += mat[c-1][r];
			}
		}

		int ans = 0;
		int x = mat.length-1;
		int y = x;
		for (int c=0;c<k2;c++) {
			for (int r=0;r<k;r++) {
				ans = Math.max(ans, mat[x-c][y-r]);
			}
		}
		
		System.out.println(ans);
	}
}
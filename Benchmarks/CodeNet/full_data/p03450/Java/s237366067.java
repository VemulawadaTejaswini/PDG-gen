
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int e = 0;
		int[][] s = new int[n + 10][2];
		for(int i = 1; i <= m; ++i) {
			int l = scan.nextInt();
			e = l;
			int r = scan.nextInt();
			int z = scan.nextInt();
			if(s[r][1] == 0) {
				s[r][0] = s[l][0] + z;
				s[r][1] = 1;
			}
			else {
				if(!(s[r][0] - s[l][0] == z)) {
					System.out.println("No");
					return;
				}
				
			}
				
		}
		if(e == 0) {
		System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}

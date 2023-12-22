import java.util.Scanner;

public class Main {
	
	private static int[] cnt1 = new int[100010];
	private static int[] cnt2 = new int[100010];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s , t;
		s = scan.next();
		t = scan.next();
		int i , length = s.length();
		
		for (i = 0;i < length;i ++) {
			char ch = s.charAt(i);
			if (ch == 'A') {
				if (i == 0) {
					cnt1[i] = 1;
				} else {
					cnt1[i] = cnt1[i - 1] + 1;
				}
			} else {
				if (i > 0) {
					cnt1[i] = cnt1[i - 1] - 1;
				} else 
					cnt1[i] = - 1;
			}
		}
		
		length = t.length();
		for (i = 0;i < length;i ++) {
			char ch = t.charAt(i);
			if (ch == 'A') {
				if (i == 0) {
					cnt2[i] = 1;
				} else {
					cnt2[i] = cnt2[i - 1] + 1;
				}
			} else {
				if (i > 0) {
					cnt2[i] = cnt2[i - 1] - 1;
				} else {
					cnt2[i] = - 1;
				}
			}
		}
		
		int total = scan.nextInt();
		for (i = 0;i < total;i ++) {
			int l1 , r1 , l2 , r2;
			l1 = scan.nextInt() - 1;
			r1 = scan.nextInt() - 1;
			l2 = scan.nextInt() - 1;
			r2 = scan.nextInt() - 1;
			
			int result1 = cnt1[r1];
			if (l1 - 1 >= 0) {
				result1 -= cnt1[l1 - 1];
			}
			int result2 = cnt2[r2];
			if (l2 - 1 >= 0) {
				result2 -= cnt2[l2 - 1];
			}
			
			int diff = Math.abs(result1 - result2);
			if (diff % 3 == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		
	}

} 




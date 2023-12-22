import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		int[] a = new int[3];
		for(int i = 0 ; i < n ; i++) {
			if(s.charAt(i) == 'a') {
				a[0]++;
			} else if(s.charAt(i) == 'b') {
				a[1]++;
			} else if(s.charAt(i) == 'c') {
				a[2]++;
			}
 		}
		// 3桁以下
		if(n == 3) {
			for(int i = 0 ; i < 3 ; i++) {
				for(int j = i + 1 ; j < 3 ; j++) {
					if(a[i] == 0 || a[j] == 0) continue;
					int x = Math.abs(a[i] - a[j]);
					if(x >= 1) {
						System.out.println("NO");
						return;
					}
				}
			}
		} else if(n == 2) {
			if(s.charAt(0) == s.charAt(1)) {
				System.out.println("NO");
				return;
			}
		} else if(n == 1) {
			System.out.println("YES");
			return;
		}
		// 4桁以上
		// 1種類のみ
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = i + 1 ; j < 3 ; j++) {
				if(a[i] == 0 && a[j] == 0) {
					System.out.println("YES");
					return;
				}
			}
		}
//--------------------------------------------------------------------------------------------------------------------------//
		boolean ok = true;
		// 2種類
		if((a[0] == 0 && a[1] >= 1 && a[2] >= 1) || (a[0] >= 1 && a[1] == 0 && a[2] >= 1) || (a[0] >= 1 && a[1] >= 1 && a[2] == 0)) {
			for(int i = 0 ; i < 3 ; i++) {
				for(int j = i + 1 ; j < 3 ; j++) {
					if(a[i] == 0 || a[j] == 0) continue;
					int x = Math.abs(a[i] - a[j]);
					if(x >= 2) {
						ok = false;
					}
				}
			}
		} else if(a[0] >= 1 && a[1] >= 1 && a[2] >= 1) {
			// 3種類
			if(Math.abs(a[0] - a[1]) >= 2 || Math.abs(a[0] - a[2]) >= 2 || Math.abs(a[1] - a[2]) >= 2) {
				ok = false;
			}
		}
		if(ok == true) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}




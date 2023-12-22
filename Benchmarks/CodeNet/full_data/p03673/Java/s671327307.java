import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder gu = new StringBuilder();
		StringBuilder ki = new StringBuilder();
		if(n==1) {
			System.out.println(sc.next());
			return;
		}
		for(int i = 0; i < n; i++) {
			int j = sc.nextInt();
			if(i % 2 == 0) {
				ki.append(" "+String.valueOf(j));
			} else {
				gu.append(" "+String.valueOf(j));
			}
		}
		if(gu.charAt(0)==' ') {
			gu = gu.deleteCharAt(0);
		}
		if(ki.charAt(0)==' ') {
			ki = ki.deleteCharAt(0);
		}
		if(n % 2 == 0) {//nが偶数回
			System.out.println(gu.reverse().toString()+" "+ki.toString());
		} else {//nが奇数回
			System.out.println(ki.reverse().toString()+" "+gu.toString());
		}
	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		String s = sc.next();
		int b = 0;
		int all =0;
		for (int i=0;i<s.length();i++) {
			if (s.charAt(i)=='c') {
				System.out.println("No");
			} else if (s.charAt(i)=='b') {
				b ++;
				if (b<=B&&all<A+B) {
					all++;
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			} else {
				all ++;
				if (all<=B+A) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		}
	}
}
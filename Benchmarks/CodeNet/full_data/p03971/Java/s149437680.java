import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(),A=sc.nextInt(),B=sc.nextInt();
		String S=sc.next();
		int pass=0;
		int orderB=0;

		for(int i=0;i<S.length();i++) {
			char ch = S.charAt(i);

			if(ch=='a') {
				if(pass<A+B) {
					pass++;
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
			}else if(ch=='b') {
				orderB++;
				if(pass<A+B && orderB<=B) {
					pass++;
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
			}else {
				System.out.println("No");
			}
		}
	}
}
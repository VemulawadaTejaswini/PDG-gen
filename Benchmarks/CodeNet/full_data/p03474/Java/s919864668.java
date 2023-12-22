import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b=sc.nextInt();
		String s = sc.next();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(a+1)!='-') {
				System.out.println("No");
				return;
			}
			if(s.charAt(i)=='-'&& i!=a+1) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}

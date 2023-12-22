import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		int a = sc.nextInt();
		int b = sc.nextInt();
		String C = sc.next();
		if(C.equals(S)) {
			System.out.println(a--+" "+b);
		}else {
			System.out.println(a+" "+b--);
		}
	}
}
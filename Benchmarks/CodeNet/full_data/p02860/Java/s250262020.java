import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		if(n%2 == 1) {
			System.out.println("No");
		}else {
			String t1 = s.substring(n/2);
			t1 += t1;
			if(t1.equals(s)) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}

}

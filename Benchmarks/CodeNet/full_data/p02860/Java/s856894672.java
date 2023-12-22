import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String s = sc.next();
		String s1 ="1";
		String s2 ="2";
		
		if(N%2 == 0) {
			s1 = s.substring(0, N/2);
			s2 = s.substring(N/2,N);
		}
		
		if(s1.equals(s2)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}
}
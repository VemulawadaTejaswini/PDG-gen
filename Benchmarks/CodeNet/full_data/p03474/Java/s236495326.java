import java.util.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(), B = sc.nextInt();
		
		String s = sc.next();
		
		for(int i = 0; i<A; i++) {
			if(s.charAt(i) - '0' < 0 && s.charAt(i) > 9) {
				System.out.println("No");
				System.exit(0);
			}
		}
		
		if(s.charAt(A) != '-') { System.out.println("No"); System.exit(0); }
		
		for(int i = A+1; i<=A+B; i++) {
			if(s.charAt(i) - '0' < 0 && s.charAt(i) > 9) {
				System.out.println("No");
				System.exit(0);
			}		
		}
		
		System.out.println("Yes");
	}

}

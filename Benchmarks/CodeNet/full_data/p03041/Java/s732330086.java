import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		A(sc);
	}
	
	public static void A(Scanner sc) {
		int n = sc.nextInt();
		int k = sc.nextInt()-1;
		String s = sc.next();
		System.out.println(s.substring(0,k)+Character.toLowerCase(s.charAt(k))+s.substring(k+1,n));
	}
}
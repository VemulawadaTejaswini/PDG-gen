import java.util.*;

public class Main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		if(s1.charAt(s1.length()-1)==s2.charAt(0)
			&& s2.charAt(s2.length()-1)==s3.charAt(0)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
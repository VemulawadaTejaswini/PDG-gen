import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] a =S.toCharArray();
		
		for(int i=0;i<S.length();i++) {
			a[i]='x';
		}
		System.out.println(a);

	}
}

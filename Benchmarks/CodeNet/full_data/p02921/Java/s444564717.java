import java.util.*;
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		
		int ans = 0;
		for (int i = 0; i< 3; i++) {
			if(S.charAt(i) == T.charAt(i)) ans++;
		}
		
		System.out.println(ans);
	}

}

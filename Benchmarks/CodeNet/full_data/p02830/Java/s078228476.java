import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		String T = sc.next();
		
		char[] s=S.toCharArray();
		char[] t=T.toCharArray();
		
		for(int i=0;i<N;i++) {
			System.out.print(s[i]);
			System.out.print(t[i]);
		}
		
		
	}
}

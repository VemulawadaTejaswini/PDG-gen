import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N = S.length();
		StringBuffer s1_temp = new StringBuffer(S.substring(0, (N - 1) / 2));
		String s1 = new String(s1_temp);
		String  s1_r = new String(s1_temp.reverse());
		StringBuffer s2_temp = new StringBuffer(S.subSequence((N + 3) / 2 - 1, N));
		String s2 = new String(s2_temp);
		String  s2_r = new String(s2_temp.reverse());
		if(s1.equals(s1_r) && s2.equals(s2_r)){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

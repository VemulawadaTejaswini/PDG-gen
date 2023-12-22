import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] C = S.toCharArray();

        String ans = "";
        for (int i = 0; i < C.length; i += 2) {
            ans += String.valueOf(C[i]);
        }

        System.out.println(ans);
	}
}

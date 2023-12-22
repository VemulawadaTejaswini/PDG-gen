import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder S = new StringBuilder(s);
		if(s.length() == 2) {
			System.out.println(s);
		}else if(s.length() == 3) {
			S.reverse();
			System.out.println(S);
		}
	}
}
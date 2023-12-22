import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int zero = 0;
		int one = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.substring(i, i + 1).equals("0")) {
				zero++;
			} else {
				one++;
			}
		}
		System.out.println(Math.min(zero, one) * 2);
	}
}

import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int flag = 1;
		for(int i = 0; i < N.length(); i++) {
			if(!N.substring(i, i + 1).equals("9")) {
				flag = 0;
			}
		}
		if(flag == 1) {
			System.out.println(9 * N.length());
		} else {
			System.out.println((Integer.parseInt(N.substring(0, 1)) - 1) + (9 * (N.length() - 1)));
		}
	}
}

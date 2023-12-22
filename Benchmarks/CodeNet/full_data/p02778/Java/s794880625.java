import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		StringBuilder sb = new StringBuilder();
		int length = S.length();
		
		for (int i=0; i<length; i++) {
			sb.append("x");
		}
		System.out.println(sb);
	}
}
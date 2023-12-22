import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		sc.close();
		StringBuilder sb = new StringBuilder(s2);
		sb.reverse();
		if(s1.equals(sb.toString())) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
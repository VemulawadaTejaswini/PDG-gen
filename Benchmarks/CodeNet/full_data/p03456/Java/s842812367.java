import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String ab = a + b;
		double num = Integer.parseInt(ab);
		for(int i = 1; i < 200; i++) {
			if(i * i == num) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}
}

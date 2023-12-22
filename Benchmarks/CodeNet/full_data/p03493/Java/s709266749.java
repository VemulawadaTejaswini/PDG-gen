import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = 0;
		for(int i =0;i <= 2; i++) {
			int m = s.charAt(i);
			n= n + m;
		}
		System.out.println(n);
	}
}
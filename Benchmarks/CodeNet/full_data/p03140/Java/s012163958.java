import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (s1.charAt(i) == s2.charAt(i)) {
				if (s2.charAt(i) != s3.charAt(i)) {
					count++;
				}
			} else {
				if (s2.charAt(i) == s3.charAt(i)) {
					count++;
				} else if (s1.charAt(i) == s3.charAt(i)){
					count++;
				} else {
					count += 2;
				}
			}
		}
		System.out.println(count);
	}
}

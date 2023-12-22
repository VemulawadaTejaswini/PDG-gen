import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String A = scan.next();
		String B = scan.next();
		String C = scan.next();
		int count = 0;
		for(int i=0;i<N;i++) {
			if (A.charAt(i)==B.charAt(i) && B.charAt(i)==C.charAt(i)) continue;
			else if (A.charAt(i)==B.charAt(i) || A.charAt(i)==C.charAt(i) || B.charAt(i)==C.charAt(i)) count++;
			else count +=2;
		}
		System.out.println(count);
	}
}

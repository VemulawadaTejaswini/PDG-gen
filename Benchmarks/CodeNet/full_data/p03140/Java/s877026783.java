import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String A = sc.next();
		String B = sc.next();
		String C = sc.next();
		sc.close();
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			char a = A.charAt(i);
			char b = B.charAt(i);
			char c = C.charAt(i);
			if(a == b && b == c) continue;
			if((a == b && a != c) || (a == c && a != b) || (b == c && a != b)) {
				cnt ++;
			}else {
				cnt += 2;
			}
		}
		System.out.println(cnt);
	}
}
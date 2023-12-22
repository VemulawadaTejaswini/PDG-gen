import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		long K = sc.nextLong();
		
		int x = 0;
		
		for(int i = 0; i < S.length(); i++) {
			x++;
			if(S.charAt(i) == '1' && x < K) {
				continue;
			} else {
				System.out.println(S.charAt(i));
				break;
			}
		}
	}
}

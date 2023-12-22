import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		if(N == 0) {
			System.out.println(M / 4);
		} else {
			for(int i = 0 ;; i++) {
				if(N != 0 && M >= 2) {
					N--;
					M -= 2;
				} else if(N == 0 && M >= 4) {
					M -= 4;
				} else {
					System.out.println(i);
					return;
				}
			}
		}
	}
}

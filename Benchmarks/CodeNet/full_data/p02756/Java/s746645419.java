import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		sb.append(sc.next());
		int q = sc.nextInt();
		int reverse = 0;

		for(int i = 0; i < q; i++) {
			if(sc.nextInt() == 1) {
				reverse = 1 - reverse;
			}else {
				if(sc.nextInt() - 1 == reverse) {
					sb.insert(0, sc.next());
				}else {
					sb.append(sc.next());
				}
			}
		}
		if(reverse == 1) System.out.println(sb.reverse().toString());
		else System.out.println(sb.toString());
		sc.close();
	}
}

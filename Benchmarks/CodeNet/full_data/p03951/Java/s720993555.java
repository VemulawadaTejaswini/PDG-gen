import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String a = sc.next();
		String b = sc.next();
		for (int i=0;i<a.length();i++) {
			boolean bo = false;
			for (int j=0;j<N-i;j++) {
				if (a.charAt(j+i)!=b.charAt(j)) {
					bo = true;
					break;
				}
			}
			if (bo==false) {
				System.out.println(N+i);
				return;
			}
		}
	}
}
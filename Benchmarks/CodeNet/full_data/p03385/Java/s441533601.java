import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int k = scanner.nextInt();
		int n1 = a+k-1;
		int n2 = b-k+1;
		if (n1>=n2) {
			for (int i=a; i<=b; i++) {
				System.out.println(i);
			}
		}else {
			for (int i=a; i<=n1; i++) {
				System.out.println(i);
			}
			for (int i=n2; i<=b; i++) {
				System.out.println(i);
			}
		}
	}

}

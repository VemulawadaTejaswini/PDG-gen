import java.util.Scanner;

public class Main {
	static int five,seven;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		five=0;
		seven=0;

		check(A);
		check(B);
		check(C);

		if(five==2&&seven==1) System.out.println("YES");
		else System.out.println("NO");
		scanner.close();
	}
	public static void check(int N) {
		if(N==5) {
			five++;
		}
		else if(N==7) {
			seven++;
		}
	}
}

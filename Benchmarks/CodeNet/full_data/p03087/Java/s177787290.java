import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		String A = sc.next();
		String[] A2 = A.split("");

		for (int i = 0; i < N2; i++) {
			int ans = 0;
			int N3 = sc.nextInt();
			int N4 = sc.nextInt();
			for (int j = N3; j < N4 ; j++) {
				if (A2[j - 1].equals("A") && A2[j].equals("C")) {ans++;}
			}
			System.out.println(ans);
		}
		sc.close();
	}
}

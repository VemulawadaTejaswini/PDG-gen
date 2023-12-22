import java.util.Scanner;

//AtCoder Beginner Contest 153
//B - Common Raccoon vs Monster
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int N = Integer.parseInt(sc.next());
		long sumA = 0;
		for (int i = 0; i < N; i++) {
			sumA += Integer.parseInt(sc.next());
		}
		sc.close();

		if (H <= sumA) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

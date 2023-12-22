import java.util.Scanner;

public class Main {

	public static void main(String[] args) { // scc puzzle
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int leftOverM = 0;
		int scc = 0;
		if (n * 2 < m) {
			leftOverM = m - (n * 2);
			n += (leftOverM / 2) / 2;
			m -= leftOverM / 2;
			System.out.println(n);
		} else {
			System.out.println(m / 2);
		}
	}

}
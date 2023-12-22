import java.util.Scanner;

//AtCoder Beginner Contest 159
//C	Maximum Volume
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = Integer.parseInt(sc.next());
		sc.close();

		double v1 = (double) (L / 3);
		double v3 = L - v1 * 2;

		System.out.println(v1*v1*v3);
	}
}

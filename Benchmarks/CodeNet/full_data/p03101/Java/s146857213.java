import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hg = sc.nextInt();
		int wg = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		sc = null;
		System.out.println((hg-h)*(wg-w));
	}
}

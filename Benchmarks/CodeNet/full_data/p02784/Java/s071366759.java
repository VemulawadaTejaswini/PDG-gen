import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int h = s.nextInt(), n = s.nextInt();
		long z = 0;
		for(int i=0;i<n;i++) {
			z += s.nextLong();
		}
		if (z >= h) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}

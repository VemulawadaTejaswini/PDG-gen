import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		if (h == 1 || w == 1) {
			System.out.println(1);
		} else {
			long nE = w/2;
			System.out.println(nE * (h%2 == 1 ? h/2 + 1l : h/2l) + (w - nE)*h/2l);
		}
		sc.close();
	}

}

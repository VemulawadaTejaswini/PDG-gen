import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[] N = new int[10];
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			N[sc.nextInt()] = 1;
		}
		if (N[1] == 1 && N[7] == 1  && N[4] == 1  && N[9] == 1 ) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}

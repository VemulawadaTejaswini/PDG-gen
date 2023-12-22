import java.util.Scanner;

public class Main {
	static int p[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt()+sc.nextInt()+sc.nextInt();

		String ans = (n >= 22) ? "bust" : "win";

		System.out.println(ans);

        return;
    }
}


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = (int)Math.sqrt((double)n);
		System.out.println(s * s);
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int i = 0;
		while(i * (i - 1) / 2 < a) {
			i ++;
		}
		System.out.println(i * (i + 1) / 2 - b);
	}
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int A = sc.nextInt();
		int count = 0;
		while(H > 0) {
			H = H - A;
			count++;
			}
		System.out.println(count);
	}
}

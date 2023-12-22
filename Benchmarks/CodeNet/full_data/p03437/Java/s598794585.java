import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		sc.close();
		if(Y%X == 0) {
			System.out.println(-1);
		}else {
			System.out.println(X);
		}
	}
}
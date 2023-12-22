
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long Y = sc.nextLong();
		if (X%Y==0) {
			System.out.println(-1);
			return ;
		}
		System.out.println(X*(Y-1));
	}
}
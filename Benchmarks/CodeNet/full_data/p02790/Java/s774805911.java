import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		String ab = "";
		String ba = "";

		for (int i = 0; i < b; i++) {
			ab += a;
		}
		for (int i = 0; i < a; i++) {
			ba += b;
		}

		if (a <= b) {
			System.out.println(ab);
		} else if (b < a) {
			System.out.println(ba);
		}

		sc.close();
	}
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();
		int k = scan.nextInt();
		String result = "Yey!";

		int [] list = new int [] {a,b,c,d,e} ;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				if (list[j] - list[i] > k) {
					result = ":(" ;
				}
			}
		}
		System.out.println(result);
	}
}
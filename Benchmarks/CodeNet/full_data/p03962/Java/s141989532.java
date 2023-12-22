import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());

		int n=0;

		if(a == b && b == c) {
			n = 1;
		}else if(a == b || b == c || c == a) {
			n = 2;
		}else {
			n = 3;
		}

		System.out.println(n);

	}

}
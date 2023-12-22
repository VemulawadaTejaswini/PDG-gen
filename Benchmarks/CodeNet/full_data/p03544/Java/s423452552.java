import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());

		int a = 2;
		int b = 1;
		int c = 0;

		if (N == 0){
			System.out.println(2);
			return;
		}else if (N == 1){
			System.out.println(1);
			return;
		}

		for (int i=2; i<=N; i++){
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println(c);
		return;
	}
}
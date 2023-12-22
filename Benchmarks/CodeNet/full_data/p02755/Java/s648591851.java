import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		for(int i = 0;i < 10000;i++) {
			if(a == i*0.08 && b == i*0.1) {
				System.out.println(i);
				return;
			}
		}

		System.out.println(-1);
	}
}

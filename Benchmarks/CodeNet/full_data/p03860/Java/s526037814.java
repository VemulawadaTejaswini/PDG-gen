import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();

		int count = 0;
		for (int i = a; i <= b; i++) {
			int result = i % x;
			if(result == 0){
				count++;
			}
		}
		System.out.println(count);
	}
}

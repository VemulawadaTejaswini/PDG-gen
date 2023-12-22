import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();


		// 最大
		int max = Math.min(a, b);

		// 最小
		int min = a+b-n;
		if(min < 0) {
			min = 0;
		}


		System.out.println(max + " " + min);


	}

}

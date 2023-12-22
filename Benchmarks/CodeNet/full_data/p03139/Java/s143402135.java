import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int max = 0;
		int min = 0;


		if(a < b) {
			max = b;
			min = a;
		} else {
			max = a;
			min = b;
		}

		int resultMin = min - (n - max);

		if(resultMin < 0) {
			resultMin = 0;
		}


		System.out.println(min + " " + resultMin);

		sc.close();
	}

}
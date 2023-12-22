import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();


		int max = 0;
		int min = 0;
		int temp = 0;

		temp = a + b - n;
		if(temp <= 0) {
			min = 0;
		}
		else {
			min = temp;
		}

		if(a>=b) {
			max = b;
		}else if(a < b) {
			max = a;

		}


		System.out.println(max + " "+ min);

	}

}
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long[] list = new long[5];
		long min = Integer.MAX_VALUE;
		long n = Long.parseLong(scan.nextLine());

		for(int i = 0; i < 5; i++) {
			list[i] = Integer.parseInt(scan.nextLine());
			min = Math.min(list[i], min);
		}

		long x = 0;

		if(n % min == 0){

			x = n / min + 4;

		}else{

			x = n / min + 5;

		}
		System.out.println(x);
	}
}
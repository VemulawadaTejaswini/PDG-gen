import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int sum = calSumOfDigits(x);

		if(x % sum== 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	//各桁の和を計算
	public static int calSumOfDigits(int n) {
		int sum =0;
		while(n>0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
}

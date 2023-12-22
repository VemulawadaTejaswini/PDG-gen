import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n % s(n) == 0)System.out.println("Yes");
		else System.out.println("No");
	}
	
	static int s(int n) {
		int num = n;
		int sum = 0;
		while(num != 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}
}
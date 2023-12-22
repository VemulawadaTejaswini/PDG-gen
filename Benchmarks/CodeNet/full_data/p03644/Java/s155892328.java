import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count =0;
		int N = sc.nextInt();
		while (true) {
			if (N%2==1) {
				break;
			}
			N/=2;
			count ++;
		}
		System.out.println(count);
	}
}

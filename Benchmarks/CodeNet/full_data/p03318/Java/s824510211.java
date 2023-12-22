import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		long ten = 1, sum = 1;
		while(num > 0) {
			System.out.println(sum);
			if(sum / ten == 9)ten *= 10;
			sum += ten;
			num--;
		}
	}
}
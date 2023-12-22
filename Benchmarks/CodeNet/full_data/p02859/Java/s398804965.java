import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		
		scan.close();
		float sum = 0;
		float sum_base = 0;
		int output = 0;
		
		sum_base = (float)(1 * 1 * 3.14);
		sum = (float) (num1 * num1 * 3.14);
		output = (int) (sum / sum_base);
		
		System.out.println(output);
		
	}
}

import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double sum = 0;
 
		for (int i = 0; i < n; i++) {
			sum += 1 / scan.nextDouble();
		}
		System.out.println(1 / sum);
	}
}
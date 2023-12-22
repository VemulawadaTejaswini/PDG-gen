
import java.util.Scanner;

public class Main {

	Scanner scan = new Scanner(System.in);
	
	void compute() {
		int n = scan.nextInt();
		
		int[] p = new int[n+1];
		int[] array = new int[n+1];
		int num = 0;
		
		for (int i=1;i<=n;i++) {
			p[i] = scan.nextInt();
		}
		
		for (int i=n;i>0;i--) {
			int sum = 0;
			for (int j=2;i*j<=n;j++) {
				sum += array[i*j];
			}
			sum = sum % 2;
			array[i] = sum == p[i] ? 0 : 1;
			num += array[i];
		}
		
		System.out.println(num);
		for (int i=1;i<=n;i++) {
			if (array[i] > 0) {
				System.out.print(i);
				System.out.print(--num == 0 ? "\n" : " ");
			}
		}
	}
	
	
	public static void main(String...arg) {
		new Main().compute();
	}
}

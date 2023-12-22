import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n, m;
		double per;
		int sum = 0;
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		m = scan.nextInt();

		int array[] = new int[n];
		double array_per[] = new double[n];

		for(int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
			sum += array[i];
		}

		per = 1.0/(4*m);

		for(int i = 0; i < n; i++) {
			array_per[i] = (double)array[i]/sum;
		}

		int count = 0;
		for(int i = 0; i < n; i++) {
			if(array_per[i] >= per) {
				count++;

				if(count >= m) {
					System.out.println("Yes");
					break;
				}
			} else {
				if(i == n-1) {
					System.out.println("No");
				}
			}
		}
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];

		int max = Integer.MIN_VALUE;
		int subMax = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			int temp = scan.nextInt();
			a[i] = temp;
			if(temp >= max) {
				subMax = max;
				max = temp;
			}else if(temp >= subMax) {
				subMax = temp;
			}
		}
		for(int i = 0; i < n; i++) {
			if(a[i] == max) {
				System.out.println(subMax);
			}else {
				System.out.println(max);
			}
		}
	}
}

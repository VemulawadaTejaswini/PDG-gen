import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int N = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i=0;i<N;i++) {
			int temp = sc.nextInt();
			if (temp>max) {
				max = temp;
			}
			if (temp<min) {
				min = temp;
			}
		}
		System.out.println(max-min);
	}
}
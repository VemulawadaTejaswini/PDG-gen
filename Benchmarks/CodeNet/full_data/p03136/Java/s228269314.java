
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		int max = 0;
		for(int i = 0; i < N; i++) {
			int tmp = sc.nextInt();
			sum += tmp;
			max = Math.max(max, tmp);
		}
		sum -= max;
		if(max < sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}

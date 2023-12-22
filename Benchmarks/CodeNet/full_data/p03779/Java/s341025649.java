
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int sum = 0;
		int count = 0;
		for(int i = 1; i <= N; i++) {
			if(N - sum - i > i) {
				sum += i;
			} else if (N - sum - i == 0){
				sum += i;
				count++;
				break;
			}
			count++;
			System.out.println(sum + ", " + count);
		}
		System.out.println(count);
		scan.close();
	}

}

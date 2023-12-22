
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = 0;
		int sum = 0;
		int num = 0;
		int tmp = 0;
		int N = scan.nextInt();
		for(int i =N; i > 0; i--) {
			tmp = i;
			while(true) {
				if(tmp % 2 == 0 && tmp > 0) {
					sum++;
					tmp /= 2;
				} else {
					if(max <= sum) {
						max = sum;
						num = i;
					}
					sum = 0;
					break;
				}
			}
		}
		System.out.println(num);
		scan.close();

	}

}

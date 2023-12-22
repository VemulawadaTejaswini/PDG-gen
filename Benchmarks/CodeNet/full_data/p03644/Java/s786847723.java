import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int count = 0;
		int result = 0;
		int result_count = 0;
		for(int i = 2; i <= x; i++) {
			count = 0;
			for(int j = 2; j <= i; j++) {
				if(j % 2 == 0) {
					count++;
				}
			}
			if(result_count < count) {
				result_count = count;
				result = i;
			}
		}



		System.out.println(result);

	}
}

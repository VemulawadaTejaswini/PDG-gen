import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int count = 0;
		int result = 0;
		int result_count = 0;
		for(int i = 1; i <= x; i++) {
			count = 0;
			int now = i;
			while(now % 2 == 0) {
				now = now / 2;
				count++;
			}
			if(result_count <= count) {
				result_count = count;
				result = i;
			}
		}



		System.out.println(result);

	}
}

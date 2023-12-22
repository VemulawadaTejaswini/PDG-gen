import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int high = 0;
		int count = 0;
		int tmp = 0;
		int max = 0;

		for(int i=1;i<=N;i++) {
			high = sc.nextInt();
			if(high <= max) {
				tmp = tmp + 1;
				max = high;
			}else {
				max = high;
				if(tmp>count) {
					count = tmp;
				}
				tmp = 0;
			}
		}
		if(tmp>count) {
			count = tmp;
		}
		System.out.println(count);

	}
}

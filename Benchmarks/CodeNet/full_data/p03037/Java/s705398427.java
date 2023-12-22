import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int l0 = 0;
		int r0 = 0;
		int min = 0;
		int max = 0;

		for (int i = 1; i <= m; i++) {
			l0 = sc.nextInt();
			r0 = sc.nextInt();
			if(i == 1){
				min = l0;
				max = r0;
			}
			if (min < l0) {
				min = l0;
			} else if (max > r0 && min > max) {
				max = r0;
			}

		}
		if(max - min < 0){
			System.out.println(0);
		}else{
			System.out.println(max - min + 1);
		}


	}
}
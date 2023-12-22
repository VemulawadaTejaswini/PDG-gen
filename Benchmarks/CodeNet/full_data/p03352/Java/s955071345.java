import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 0;
		for(int i = 2; i < n; i++) {
			int k = i;
			int j = 1;
			while(k * i <= n) {
				k *= i;
				j++;
			}
			if(j > 1) {
				num = Math.max(num, k);
			}
		}
		if(n == 1) {
			System.out.println(1);
		}else {
			System.out.println(num);
		}
	}
}

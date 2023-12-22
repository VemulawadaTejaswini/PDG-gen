import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int count = 0;
		for(int i = 105; i <= n; i++) {
			int div = 0;
			for(int j = 1; j <= i; j++) {
				if(i%j ==0)div++;
			}
			if(div == 8)count++;
		}
		System.out.println(count);
	}
}

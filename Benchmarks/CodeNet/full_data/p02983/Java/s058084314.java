import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long l = sc.nextLong();
		long r = sc.nextLong();
		
		int l2 = (int) (l % 2019);
		int r2 = (int) (r % 2019);
		

		if(l - r > 2019)System.out.println(0);
		else if(l2 < r2) {
			int min = l2 * (l2+1) % 2019;
			for (int i = l2; i < r2; i++) {
				for (int j = i+1; j < r2; j++) {
					if(min > ((i * j) % 2019)) {
						min = (i * j) % 2019;
					}
				}
			}
			System.out.println(min);
		}else {
			System.out.println(0);
		}
	}
}

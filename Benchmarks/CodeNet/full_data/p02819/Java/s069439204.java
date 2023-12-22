import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Long X = sc.nextLong();
		for(Long i = X; i<1000000000; i++) {
			int count = 0;
			//1～iの間繰り返す i以下の素数を探す。
			for(int num = 1; num<i; num++) {
				if(i%num==0) {
					count++;
				}
			}

			if(count < 3) {
				System.out.println(i);
				break;
			}
		}
	}
}

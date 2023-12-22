import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long maxv = 0;
		//約数を探して最大の物だけ保持するよ
		for(long i = 1; i <= (int)Math.sqrt(n); i++) {
			if(n % i == 0) {
				maxv = i;
			}

		}

		if(maxv == 0) {//約数がないなら
			System.out.println(n - 1);
		}else {
			long sum = 0;
			sum += maxv - 1;
			sum += (n / maxv) - 1;
			System.out.println(sum);
		}
	}

}

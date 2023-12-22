import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();


		long sum =0;

		for(int i=1;i<=n;i++) {

			if(i%3==0 || i%5==0) {
				continue;
			}else {
				sum += i;
			}


		}

		System.out.println(sum);
		scan.close();
	}

}

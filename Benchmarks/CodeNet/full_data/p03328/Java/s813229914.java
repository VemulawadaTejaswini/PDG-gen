import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int d = b -a;
		int count =0;

		for(int i=d;i>0;i--) {
			count += i;
		}

		int ans = count-b;
		System.out.println(ans);
	}

}


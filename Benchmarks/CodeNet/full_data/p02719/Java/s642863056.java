import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		if(n % k < k - (n %k))
			k = n % k;
		else
			k = k - (n %k);
		System.out.println(k);
	}

}
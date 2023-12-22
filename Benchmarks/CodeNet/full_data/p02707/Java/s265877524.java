import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n-1];
		int[] num = new int[n];

		int i = 0;
		while(i < n-1) {
			a[i] = sc.nextInt();
			num[i] = 0;
			i++;
		}

		num[n-1] = 0;

		for(i = 0; i < n-1; i++) {
			num[a[i]-1]++;
		}

		for(i = 0; i < n; i++) {
			System.out.println(num[i]);
		}
	}

}
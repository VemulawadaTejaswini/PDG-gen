import java. util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int [] a = new int [n];
		int [] b = new int [n];

		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();
		}

		int ave = java.util.Arrays.stream(a).sum()/n;

		for(int i=0;i<n;i++) {
			b[i] = (a[i] - ave)*(a[i] - ave);
		}

		int total = java.util.Arrays.stream(b).sum();

		System.out.println(total);

	}

}
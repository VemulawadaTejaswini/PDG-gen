import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int [] ans = new int[num+1];
		for(int i = 1 ; i < num ;i++) {
			int a = sc.nextInt();
			ans[a]++;
		}
		for(int i = 1 ; i <= num ;i++) {
			System.out.println(ans[i]);
		}
	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int ans = 0;
		for (int i = A; i <= B; i++) {
			StringBuilder num = new StringBuilder();
			num.append(i);
			StringBuilder revNum = new StringBuilder();
			revNum.append(i).reverse();
			if (num.toString().equals(revNum.toString())) {
				ans++;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
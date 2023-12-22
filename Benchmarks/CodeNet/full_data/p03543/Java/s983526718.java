import java.util.Scanner;
 
public class Main{
	static int M = 1000000007;
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int pre = 0, curr = 1, ans = 0;
		boolean flag = false;
		while (num > 0) {
			curr = num % 10;
			if (pre == curr) {
				ans++;
				pre = curr;
			} else {
				ans = 1;
				pre = curr;
			}
			if (ans >= 3) {
				flag = true;
				break;
			}
			num /= 10;
 
		}
		System.out.println(flag == true ? "Yes" : "No");
	}
}
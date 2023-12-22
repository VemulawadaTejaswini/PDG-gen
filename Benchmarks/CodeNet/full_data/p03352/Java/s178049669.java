import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		scan.close();
		int temp = (int)Math.sqrt(X);
		temp = temp * temp;
		int s = temp;
		int a = 2;
		int cnt = 2;
		boolean flag = true;
		if(temp == 1) {
			System.out.println(1);
			System.exit(0);
		}
		while(flag) {
			int k = (int)Math.pow(a, cnt);
			if(k <= X) {
				if(temp < k) {
					temp = k;
				}
			}else {
				a ++;
				cnt = 1;
			}
			cnt ++;
			if(k == s) {
				break;
			}
		}
		System.out.println(temp);
	}
}

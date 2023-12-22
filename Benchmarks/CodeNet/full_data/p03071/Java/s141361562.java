import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int cnt = 0;
		for(int i = 0; i < 2; i++) {
			if(a < b) {
				cnt = cnt + b;
				b = b - 1;
			}
			else {
				cnt = cnt + a;
				a = a - 1;
			}
		}
		System.out.println(cnt);
	}
}
import java.util.Scanner;

// https://atcoder.jp/contests/abc085/tasks/abc085_c
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int y = scanner.nextInt();

		// 10000a+5000b+1000c=y
		boolean flag = true;
		loop: for(int a=0;a<=n;a++){
			for(int b=0;b<=n-a;b++) {
				int c = n-a-b;
				if(10000*a+5000*b+1000*c==y) {
					System.out.println(a+" "+b+" "+c);
					flag = false;
					break loop;
				}
			}
		}

		if(flag) {
			System.out.println(-1+" "+-1+" "+-1);
		}
		scanner.close();
	}
}
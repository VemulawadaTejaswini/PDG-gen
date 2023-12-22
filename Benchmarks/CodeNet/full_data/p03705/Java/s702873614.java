import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long min = 0;
		long max = 0;
		long cnt = 0;

		if(n == 1) {
			if(a == b) {
				cnt++;
			}else if(a != b) {
				//なにもしない
			}
		}else if(n > 1) {
			if(a > b) {
				//なにもしない
			}else if(a < b){
				for(int i = 0 ; i < n ; i++) {
					min += a;
					max += b;
				}
				cnt = (max - b + a) - (min - a + b) + 1;
			}else if(a == b){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}

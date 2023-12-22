import java.util.Scanner;
public class Main{
	static int calc(int x) {
		int ret = 0;
		while(x % 100 == 0) {
			x/=100;
			ret++;
		}
		return ret;
		
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int d = stdIn.nextInt();
		int n = stdIn.nextInt();
		int cnt = 0;
		int val = 0;
		while(cnt < n) {
			val++;
			if(calc(val) == d) {
				cnt++;
			}
		}
		System.out.println(val);
		
	}
}
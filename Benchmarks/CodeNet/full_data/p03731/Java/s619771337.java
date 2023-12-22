import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); long T = sc.nextLong();
		long ans = 0;
		long time = sc.nextLong();
		for(int i = 1; i < N; i++) {
			long t = sc.nextLong();
			if(time + T < t) {
				ans += T;
				time = t;
			}else {
				ans += t - time;
				time = t;
			}
		}
		System.out.println(ans + T);
	}
}
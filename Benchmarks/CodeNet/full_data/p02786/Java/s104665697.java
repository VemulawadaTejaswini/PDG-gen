import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long h = scan.nextLong();
		long cnt = 0;
		while(h > 0) {
			h = h / 2;
			cnt++;
		}

		long ans = 0;

		long i;
		for(i = 0; i < cnt; i++) {
			ans += Math.pow(2, i);
		}
		System.out.println(ans);
	}
}
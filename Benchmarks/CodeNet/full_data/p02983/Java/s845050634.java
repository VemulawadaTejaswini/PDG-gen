import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			long l, r;
		l = s.nextInt();
		r = s.nextInt();
		long ans = 2019;
		for (long i = l; i <= l; i++) {
          if(i%2==0||i%3==0||i%5==0||i%7==0){
			for (long j = i+1; j <= r; j++) {
				ans = Math.min(ans, (i * j) % 2019);
			}
          }
		}
		System.out.println(ans);
	}
}
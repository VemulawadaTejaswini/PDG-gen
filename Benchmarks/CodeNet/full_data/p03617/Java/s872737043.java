import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		int h = sc.nextInt();
		int s = sc.nextInt();
		int d = sc.nextInt();
		
		long n = sc.nextInt();
		
		h=Math.min(q*2,h);
		s=Math.min(h*2,s);
		d=Math.min(s*2,d);
		
		long ans = (n/2)*d+(n%2)*s;
		System.out.println(ans);
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		
		long total = 0;
		
		for(int a = 1; a < k+1; a++) {
			for(int b = 1; b < k+1; b++) {
				for(int c = 1; c < k+1; c++) {
					total += gcd(gcd(a, b), c);
				}
			}
		}
		System.out.println(total);
	}
	
	//ユークリッドの互除法
	static int gcd(int p, int q) {
		if(p % q == 0)	return q;	//最大公約数
		return gcd(q, p % q);		//答えが見つかるまで繰り返し
	}

}

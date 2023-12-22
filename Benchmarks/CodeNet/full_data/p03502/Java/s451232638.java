import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int a,b,c,d,e,f,g,h,i,fx ;
		String ans = " " ;

		for (int x = 1 ; x <= N ; x++) {
			a = x % 10 ; //1の位
			b = (x/10) % 10 ; //10の位
			c = (x/100) % 10 ; //100の位
			d = (x/1000) % 10 ; //1000の位
			e = (x/10000) % 10 ; //10000の位
			f =  (x/100000) % 10 ; //100000の位
			g = (x/1000000) % 10 ; //1000000の位
			h = (x/10000000) % 10 ; //10000000の位
			i = (x/100000000) % 10 ; //100000000の位
			fx = a+b+c+d+e+f+g+h+i ;

			if ( N % fx == 0 ) {
				ans = "Yes" ;
			} else {
				ans = "No" ;
			}
		}
		System.out.println(ans);
	}
}

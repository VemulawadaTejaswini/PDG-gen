import java.util.Scanner;

public class Main {
	static int gcd(int a , int b){
		if(a < b ){
			return gcd(b, a);
		}
		if(b == 0){
			return a;
		}
		return gcd(b , a % b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		long ret = 0;
		for(int a = 1 ; a <= K ; ++a){
			for(int b = 1 ; b <= K ; ++b){
				int g1 = gcd(a , b);
				for(int c = 1 ; c <= K ; ++c){
					int g2 = gcd(g1 , c);
					ret += g2;
				}
			}
		}
		System.out.println(ret);
	}
}

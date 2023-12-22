import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();
		
		//確率の計算
		//1パターンずつしかないもの
		double x1 = 0;
		if(n > d){
			x1 = 1.0/n/n * d * 2;
		}
		
//		System.out.println(x1);
		
		//2パターンありえるもの
		double x2 = 0;
		if(n > 2*d){
			x2 = 1.0/n/n * (n - 2*d);
		}
		if(d != 0){
			x2 *= 2.0;
		}
//		System.out.println(x2);
		
		double x3 = x1 + x2;
		
		System.out.printf("%.10f\n",x3*(m - 1));
	}

}

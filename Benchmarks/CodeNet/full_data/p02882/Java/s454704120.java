import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double x = sc.nextDouble();
			
			double h = x / Math.pow(a, 2);
			
			//傾きと高さの関係を考える
			double tan = 2 * ( b - h) / a;			
			
			//整合性をチェック
//			System.out.println("h = " + h);
//			System.out.println("tan = " + tan);
//			System.out.println("dh = " + a * tan / 2);
			
			double dh = a * tan / 2;
			
			if ( dh > h ) {
				//三角形になっている
				//c * ctan / 2 = a * h && ctan = b
				//c * b /2 = a * h
				// c = 2 * a * h / b
				// tan = b^2 / 2 * a * h
				tan = Math.pow(b, 2) / (2 * a * h);
			}

			double result = Math.atan(tan) * 180 / Math.PI;
			System.out.println(result);
		}
	}
}
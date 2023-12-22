import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

// https://atcoder.jp/contests/panasonic2020/tasks/panasonic2020_c
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		BigDecimal A = sqrt(new BigDecimal(a), 50);
		BigDecimal B = sqrt(new BigDecimal(b), 50);
		BigDecimal C = sqrt(new BigDecimal(c), 50);

		if(A.add(B).compareTo(C)==-1) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
    public static BigDecimal sqrt(BigDecimal a, int scale){
        //とりあえずdoubleのsqrtを求める
        BigDecimal x = new BigDecimal(
                Math.sqrt(a.doubleValue()), MathContext.DECIMAL64);
        if(scale < 17) return x;

        BigDecimal b2 = new BigDecimal(2);
        for(int tempScale = 16; tempScale < scale; tempScale *= 2){
            //x = x - (x * x - a) / (2 * x);
            x = x.subtract(
                    x.multiply(x).subtract(a).divide(
                    x.multiply(b2), scale, BigDecimal.ROUND_HALF_EVEN));
        }
        return x;
    }
}
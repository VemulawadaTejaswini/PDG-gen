import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		double a = sc.nextDouble();
		// スペース区切りの整数の入力
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = a * a * b;
		if(2 * c > d){
			System.out.println(Math.toDegrees(Math.atan(2 * (b - c * b / d) /  a)));
		}else{
			System.out.println(90 - Math.toDegrees(Math.atan(2 * c / a / b/ b)));
		}
		
		
	}
}
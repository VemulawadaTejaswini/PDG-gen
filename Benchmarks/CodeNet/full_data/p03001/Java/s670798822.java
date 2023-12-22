import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		Double W = sc.nextDouble();
		Double H = sc.nextDouble();
		Double x = sc.nextDouble();
		Double y = sc.nextDouble();

		System.out.println(W*H/2);

		if(Math.pow((2*x - W),2) < 0.001 && Math.pow((2*y - H),2)<0.001){
			System.out.println(1);
		}else{
			System.out.println(0);
		}

		sc.close();
	}
};
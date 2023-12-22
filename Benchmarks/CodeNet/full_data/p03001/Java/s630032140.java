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
		Double cx = W/2;
		Double cy = H/2;

		System.out.println(W*H/2);

		if(x == cx && y == cy){
			System.out.println(1);
		}else{
			System.out.println(0);
		}

		sc.close();
	}
};

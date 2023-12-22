import java.util.*;
import java.lang.Math.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int A = sc.nextInt();
		// スペース区切りの整数の入力
		int B = sc.nextInt();

		int distance = Math.abs(A-B);
		int harfDistance = distance / 2;

		int left = Math.max(A, B) - harfDistance;
		int right = Math.min(A, B) + harfDistance;

		if(left == right){
			System.out.println(left);
		}else{
			System.out.println("IMPOSSIBLE");
		}
	}
}
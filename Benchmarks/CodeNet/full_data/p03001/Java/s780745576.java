import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入
		long w = sc.nextInt();
		long h = sc.nextInt();
		long x = sc.nextInt();
		long y = sc.nextInt();

		double s = w *h;

		System.out.println(s/2);

		if(w<2 || h<2){
			System.out.println(0);
		}else if(w/2 == x && w%2 == 0 && h/2 == y && h%2 == 0){
			System.out.println(1);
		}else{
			System.out.println(0);
		}
	}
}

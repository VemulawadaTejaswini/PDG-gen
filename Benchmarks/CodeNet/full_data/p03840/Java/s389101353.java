import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int xi = sc.nextInt();
		int xo = sc.nextInt();
		int xt = sc.nextInt();
		int xj = sc.nextInt();
		int xl = sc.nextInt();
		int xs = sc.nextInt();
		int xz = sc.nextInt();
		int ans = 0;

		if( xj%2 == 1 && xl%2 == 1 && xi >= 1 ){
			ans += 3;
			xj--; xl--; xi--;
		}

		while( xj >= 2 ){
			ans += 2;
			xj -= 2;
		}

		while( xl >= 2 ){
			ans += 2;
			xj -= 2;
		}

		while( xi >= 2 ){
			ans += 2;
			xj -= 2;
		}

		ans += xo;

		System.out.println(ans);
		return;
	}
}
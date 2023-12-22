import java.util.*;
public class Soln {
	static int nBurgersPossible(int buns, int center) {
		if(buns >= center*2) return center;
		return buns/2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt(), D = sc.nextInt();
		int days = 0;
		for(int i = 4; i <= M; i++) {
			for(int j = 22; j <= D; j++) {
				if(j%10 * j/10 == M) {
					days++;
					if((j%10) * 10 + j/10 <= D) days++;
					break;
				}
			}
		}
		System.out.println(days);
	}
}
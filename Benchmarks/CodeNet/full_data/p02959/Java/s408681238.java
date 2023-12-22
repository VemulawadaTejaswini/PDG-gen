import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		Integer A[] = new Integer[N+1];
		Integer B[] = new Integer[N];
		Arrays.setAll(A, i -> sc.nextInt());
		Arrays.setAll(B, i -> sc.nextInt());
		int count = 0;
		int nextHero = 0;
		for(int i=0;i<N;i++){
			count = count + Math.min(A[i],B[i] + nextHero);
			if(A[i] < (B[i] + nextHero)){
				nextHero = Math.min((B[i] + nextHero) - A [i],B[i]);
			}else{
				nextHero = 0;
			}
		}
		count = count + Math.min(A[N],nextHero);

		System.out.println(count);

		sc.close();
	}
};
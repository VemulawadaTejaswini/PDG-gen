import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int amount = 0;
		Integer Array[] = new Integer[N];
		for(int i = 0; i < N; i++){
			Array[i] = sc.nextInt();
		}
		for(int i = 1; i < N; i++){
			for(int j = 0; j < i; j ++){
				amount += Array[i]*Array[j];
			}
		}
		System.out.println(amount);
		sc.close();
	}
};
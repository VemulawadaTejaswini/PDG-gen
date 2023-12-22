import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int D = sc.nextInt();
		double distance = 0;
		int count = 0;
		Integer Array[][] = new Integer[N][D];
		for(int i = 0; i < N; i++){
			for(int j = 0; j < D; j ++){
				Array[i][j] = sc.nextInt();
			}
		}
		for(int i = 1; i < N; i++){
			for(int j = 0; j < i; j ++){
				for(int k = 0; k < D; k ++){
					distance += Math.pow(Array[i][k]-Array[j][k], 2);
				}
				distance = Math.pow(distance, 0.5);
				distance = distance*1000000;
				if(distance%1000000==0){
					count++;
				}
			}
		}

		System.out.println(count);

		sc.close();
	}
};
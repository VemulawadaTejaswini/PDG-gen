import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int count = 0;

		Integer Array[] = new Integer[N];
		for(int i = 0; i < N; i++){
			Array[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++){
			for(int j = 0; j < N; j++){
				for(int k = 0; k < N; k++){
					if(Array[i]<Array[j]+Array[k] && Array[j]<Array[k]+Array[i] && Array[k]<Array[i]+Array[j]){
						if(!(i == j || j == k || k == i)){
							count++;
						}
					}
				}
			}
		}

		System.out.println(count/6);

		sc.close();
	}
};

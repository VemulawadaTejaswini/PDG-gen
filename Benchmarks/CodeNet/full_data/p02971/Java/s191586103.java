import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		Integer Array[] = new Integer[N];
		Integer max[] = new Integer[N];

		for(int i = 0; i<N; i++){
			Array[i] = sc.nextInt();
			max[i] = 1;
		}

		for(int i = 0; i<N; i++){
			for(int j = 0; j<N; j++){
				if(i != j){
					max[i] = Math.max(max[i],Array[j]);
				}
			}
			System.out.println(max[i]);
		}

		sc.close();
	}
};

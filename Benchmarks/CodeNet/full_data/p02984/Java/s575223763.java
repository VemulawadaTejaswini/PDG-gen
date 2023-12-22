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
		int ans = 0;
		for(int i = 0; i < N; i++){
			Array[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++){
			ans = 0;
			for(int j = 0; j < N; j++){
				if(j>=i){
					if((i+j)%2==0){
						ans += Array[j];
					}else{
						ans -= Array[j];
					}
				}else{
					if((i+j)%2==0){
						ans -= Array[j];
					}else{
						ans += Array[j];
					}
				}
			}
			System.out.println(ans);
		}


		sc.close();
	}
};

import java.util.*;
/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int min = N+1;
		for(int i=1; i<N; i++){
			if(N%i==0){
				if((i+N/i)<min){
					min = i+(N/i);
				}
			}
		}
		System.out.println(min-2);
		sc.close();
	}
};
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		
		int n = sc.nextInt();
		
		int[] view = new int[n];
		int cnt = n;
		
		for(int i = 0 ; i < n; i++) {
			view[i] = sc.nextInt();	
		}
		
		for(int k = 0; k < n; k++) {		
			for(int l = 1; l <= k; l++) {
				if(view[k] < view[k - l]) {
					cnt = cnt - 1;
					break;
				}
			}
		}

		System.out.println(cnt);
	}
}
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();

		int[] B = new int[n];
		int m = 1;

		for(int i=0;i<n-1;i++){
			int a = sc.nextInt();
			if(a*m<0){
				a = a*m*-1;
				m = -1;
			} else {
              	a = a*m;
				m = 1;
			}
			B[i] = a;
		}

		int a = sc.nextInt();
		if(B[n-2]+a*m>-B[n-2]-a*m){
			B[n-1] = a*m;
		} else {
			B[n-2] = -B[n-2];
			B[n-1] = -a*m;
		}

		long sum = 0;

		for(int i=0;i<n;i++){
			sum += B[i];
		}

		// 出力
		System.out.println(sum);
	}
}
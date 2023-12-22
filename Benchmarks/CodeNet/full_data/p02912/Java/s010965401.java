import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int l = n-1;
		int w;
		for(int i = 0; i < m; i++){
			a[l] /= 2;
			w = a[l];
			for(int k = n-2; k >= 0; k--){
				if(a[l] >= a[k]){
					a[k+1] = w;
					break;
				}
				else{
					a[k+1] = a[k];
				}
			}
		}
		long sum = 0;
		for(int i = 0; i < n; i++){
			sum += a[i];
		}
		System.out.print(sum);
	}

}

import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] sum = new int[n];
		for(int i=0;i<n;i++){
			int tmp = sc.nextInt();
			a[i] = tmp;
			sum[tmp-1]++;
		}
		// for(int k=0;k<n;k++){
		// 	System.out.println("a[" +k+ "]="+a[k]+", sum["+k+"]="+sum[k]);
		// }
		int total = 0;
		for(int i=0;i<n;i++){
			total += sum[i]*(sum[i]-1)/2;
		}
		for(int i=0;i<n;i++){
			int minus = 0;
			if(sum[a[i]-1] >= 2){
				int moto = sum[a[i]-1]*(sum[a[i]-1]-1)/2;
				int ato = (sum[a[i]-1]-1)*(sum[a[i]-1]-2)/2;
				minus = moto - ato;
			}
			System.out.println(total-minus);
		}
	}
}
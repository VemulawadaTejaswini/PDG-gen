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
		for(int i=0;i<n;i++){
			int ans = 0;
			for(int j=0;j<n;j++){
				if(sum[a[i]-1] >= 2){
					if(a[i]-1 == j){
						ans += (sum[j]-1)*(sum[j]-2) / 2;
					}else{
						ans += sum[j]*(sum[j]-1) / 2;
					}
				}
			}
			System.out.println(ans);
		}
	}
}
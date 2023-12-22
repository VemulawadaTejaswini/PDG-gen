import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = sc.nextInt();
		int a[] = new int [N];
		int sum[] = new int[N-1];
		int cnt = 0;
		for(int i=0;i<N;i++){
			a[i] = sc.nextInt();
			if(i>0){
				sum[i-1] = a[i-1] + a[i];
			}
		}
		for(int i=0;i<N-1;i++){
			if(sum[i]>x){
				out:for(;;){
					a[i+1]--;
					sum[i]--;
					cnt++;
					if(sum[i]<=x)break;
					if(a[i+1]==0){
						for(;;){
							a[i]--;
							sum[i]--;
							cnt++;
							if(sum[i]<=x)break out;
						}
					}
				}
			}
		}
		System.out.println(cnt);
	}
}
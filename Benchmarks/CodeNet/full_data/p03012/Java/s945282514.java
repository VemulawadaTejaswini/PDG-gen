import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] W = new int[N];
		int add1 = 0;
		int add2 = 0;
		int[] ans = new int[N];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i<N){
			W[i] = sc.nextInt();
			i++;
		}
		
		for(i=0; i<N; i++){
			for(j=i+1; j<N; j++){
				add1 += W[j];
			}
			for(k=0; k<=i; k++){
				add2 += W[k];
			}
			ans[i] = add1 - add2;
			
			if(ans[i] < 0){
				ans[i] = ans[i] * -1;
			}
			
			add1 = 0;
			add2 = 0;
		}
		
		k=0;
		
		for(i=0; i<N; i++){
			for(j=i+1; j<N; j++){
				if(ans[i] > ans[j]){
					k = ans[i];
					ans[i] = ans[j];
					ans[j] = k;
				}
			}
		}
		
		System.out.println(ans[0]);
	}
}
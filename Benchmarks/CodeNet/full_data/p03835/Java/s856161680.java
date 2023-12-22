import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int S = sc.nextInt();
	//	int[]x = new int[S/3+1];
	//	int[]y = new int[K/3+1];
	//	int[]z = new int[K/3+1];
		int res = 0;
		for(int i = K; i>=0; i--){
			int v = S-i;
		//	System.out.println(v);
			if(v<=2*K){
				if(v<=K)res+=v+1;
				else if(v == 2*K){ 
					res+=1;
				}
				else{
					res = res + ( K - ( v-K ) +1);
				}
			}
		}
		System.out.println(res);
	}
}

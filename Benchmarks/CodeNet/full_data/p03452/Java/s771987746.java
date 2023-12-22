import java.util.*;
public class Main {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] L = new int[M];
		int[] R = new int[M];
		int[] D = new int[M];
		int[] X = new int[N+1];
		boolean h1 = false;
		boolean h2 = false;
		boolean h3 = true;
		
		for(int i=0;i<M;i++){
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
			D[i] = sc.nextInt();
			if(i == 0){
				X[L[i]] = 0;
				X[R[i]] = D[i] + X[L[i]];
			}else{
				for(int j=0;j<i;j++){
					if(L[j] == L[i] || R[j] == L[i]){
						h1 = true;
					}
					if(L[j] == R[i] || R[j] == R[i]){
						h2 = true;
					}
				}
				if(h1 && h2){
					if((X[L[i]] ==0) && (X[R[i]] == 0)){
						X[R[i]] = D[i] + X[L[i]];
						for(int s = 0;s<i;s++){
							if(R[i] == L[s]){
								X[R[s]] += D[i];
							}
						}
					}
					if(X[R[i]] - X[L[i]] != D[i]){
						h3 = false;
						break;
					}
				}else{
					if(h1){
						X[R[i]] = X[L[i]] + D[i];
					}else if(h2){
						X[L[i]] = X[R[i]] - D[i];
					}else{
					X[L[i]] = 0;
					X[R[i]] = D[i] + X[L[i]];
					}
				}
			}
			h1 = false;
			h2 = false;
			h3 = true;
		}
		if(h3){
			System.out.print("Yes");
		}else{
			System.out.print("No");
		}
	}
}

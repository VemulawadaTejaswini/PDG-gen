import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int K = sc.nextInt();
		int n = (int)Math.pow(2,M);
		
		if(K > n){
			System.out.print(-1);
			return;
		}else if(M == 0){
			if(K == 0){
				System.out.print("0 0");
			}else{
				System.out.print(-1);
			}
			return;
		}else if(M == 1){
			if(K == 0){
				System.out.print("0 0 1 1");
			}else{
				System.out.print(-1);
			}
			return;
		}
		for(int i = 0; i < n; i++){
			if(K == i){
				continue;
			}else{
				System.out.print(i + " ");
			}
		}
		for(int i = n-1; n > -1; i--){
			if(K == i){
				continue;
			}else{
				System.out.print(i + " ");
			}
		}
	}
}
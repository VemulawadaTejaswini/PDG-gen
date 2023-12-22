import java.util.*;

public class Main{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();
	
		for(int i = 0 ; i < K ; i++ ){
			if(A+K > B-K){
				K--;
			}else{
				break;
			}
		}
		
		if(A+K = B-K){
			for(int j = 0; j < B-A ; j++){
				System.out.println(A);
			}
		}else{
			for(int m = 0; m < K ; m++ ){
				System.out.println(A+m);
			}
			for(int n = K; n < K ; n-- ){
				System.out.println(B-K);
			}
		}
	}
}
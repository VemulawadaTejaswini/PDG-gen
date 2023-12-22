import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();

		for(int k=0;k<K;k++){
			if(A+k<=B)
			System.out.println(A+k);
		}
		int max = A+K;
		for(int k=K-1;k>=0;k--){
			if(max>B-k) continue;
			System.out.println(B-k);
		}
	}
}
import java.util.*;
 
class Main{
	
	public static void main(String args[]){
 
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		int B[] = new int[N];
		int C[] = new int[N];
		long sum_A = 0;
		long sum_B = 0;
 
		for(int n=0;n<N;n++){
			A[n] = sc.nextInt();
			sum_A += A[n];	
		}
		for(int n=0;n<N;n++){
			B[n] = sc.nextInt();
			sum_B += B[n];
			C[n] = A[n] - B[n];
		}
		Arrays.sort(C);
		if(sum_A < sum_B){
			System.out.println(-1);
			return;
		}
		int arg=0;
		long sum_minus=0;
		for(int c : C){
			if(c<0){
				sum_minus += Math.abs(c);
				arg++;
			}else{
				break;
			}
		}
		if(sum_minus == 0){
			System.out.println(0);
			return;
		}
		int tmp = 0;
		for(int n=C.length-1;n>0;n--){
			
			sum_minus -= C[n];
			tmp++;
			if(sum_minus<=0){
				break;
			}
		}
		System.out.println(tmp+arg);
 
 
	}
}
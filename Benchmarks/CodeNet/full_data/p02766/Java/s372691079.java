import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		double N = sc.nextInt(); //入力数
		double K = sc.nextInt(); //進数	
	
		int count = 0;
		
		while(K < N){
			N = N / K;
			count++;
		}
		
		System.out.println(count + 1);
	}
}
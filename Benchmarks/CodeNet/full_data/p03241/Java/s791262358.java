import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int max=1;
		for(int i=1; i*i<=M; i++){
			if(M%i==0 && i*N<=M){
				max=Math.max(max,i);
			}
			if(M%i==0 && (M/i)*N<=M){
				max=Math.max(max,M/i);
			}
		}
		if(M%N==0){
			max=Math.max(max,M/N);
		}
		System.out.println(max);
	}
}
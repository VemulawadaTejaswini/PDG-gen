import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int M = sc.nextInt();
	boolean[] can = new boolean[N];//N枚のカード
	for(int i=0;i<N;i++) can[i]=true;

	int[] L = new int[M];
	int[] R = new int[M];
	for(int i=0;i<M;i++){
	    L[i] = sc.nextInt();
	    R[i] = sc.nextInt();
	}
	
	for(int i=0;i<M;i++){//M個のゲートについてしらべる
	    for(int j=0;j<N;j++){
		if(! (L[i]<=j && j<=R[i]) ){
		    can[j]=false;
		}
	    }
	}
	int count=0;
	for(int i=0;i<N;i++){
	    if(can[i]==true) count++;
	}
	System.out.print(count);
    }
}

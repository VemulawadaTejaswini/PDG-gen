import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] T = new int[N+1];
        for(int i = 1; i <= N; i++){
        	T[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        int[] P = new int[M+1];
        int[] X = new int[M+1];
        for(int i = 1; i <= M; i++){
        	P[i] = sc.nextInt();
        	X[i] = sc.nextInt();
        }
        int sum;
        for(int i = 1; i <= M; i++){
        	sum = 0;
        	for(int j = 1; j <= N; j++){
        		if(j == P[i]){
        			sum = sum + X[i];
        		}
        		else sum = sum + T[j];
        	}
        	System.out.println(sum);
        }  
	}

}
import java.util.*;
import java.io.*;

public class Main {
	public static long solveMax(int K, long[] A){
		long childrenMax = 2;
		for(int k=K-1;k>=0;k--){
			childrenMax = (childrenMax/A[k])*A[k] + A[k]-1;
		}
		return childrenMax;
	}
	public static long solveMin(int K, long[] A){
		long childrenMin = 2;
		for(int k=K-1;k>=0;k--){
			childrenMin = ((childrenMin+A[k]-1)/A[k])*A[k];
		}
		return childrenMin;
	}
	
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        long[] A = new long[K];
        for(int k=0;k<K;k++)A[k]=sc.nextLong();
        
        long M = solveMax(K,A);
        long m = solveMin(K,A);
        if(M>=m) System.out.println(m+" "+M);
        else System.out.println("-1");
        
        
    }
}
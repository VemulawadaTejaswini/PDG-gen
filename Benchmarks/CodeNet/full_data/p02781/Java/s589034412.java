import java.util.*;
 
import java.io.*;
 
public class Main{

    public static long Combination(long n, long r){
        long A = 1;
        long B = 1;
        for(long i = 0; i < r; i++){
            A = A*(n-i);
            B = B*(r-i);
        }
        if(A == 0) return 1;
        return A/B;
    }
 
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
        String N = s.next();
        int K = s.nextInt();
        
        long max = 0;
        if(K > N.length()){
            System.out.println(0);
        }else if(K < N.length){
            for(int i = 0; i < K; i++){
                for(int j = 0; j < Character.getNumericValue(N.charAt(i)); j++){
                    if(j == 0){
                        max = max + (long)(Math.pow(9, (double)(K-i)))*Combination((long)(N.length()-i-1), K-i);
                    }else{
                        max = max + (long)(Math.pow(9, (double)(K-i-1)))*Combination((long)(N.length()-i-1), K-i-1);
                    }
                    
                }
            }
            max++;

            System.out.println(max);
        }else{
            for(int i = 0; i < K; i++){
                for(int j = 0; j < Character.getNumericValue(N.charAt(i)); j++){
                    if(j == 0){
                        
                    }else{
                        max = max + (long)(Math.pow(9, (double)(K-i-1)));
                    }
                    
                }
            }
            max++;

            System.out.println(max);
        }
        
	}
} 
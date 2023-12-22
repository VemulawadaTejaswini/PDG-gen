import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main (String[] args) throws IOException
    {
    	Scanner sc = new Scanner(System.in);
     	int N = sc.nextInt();
     	int K = sc.nextInt();
     	int ans;
     	String D[] = new String [K];
     	
     	for (int i = 0 ; i <= K-1 ; i++){
     		D[i] = sc.next();
     	}
     	
     	ans = N;
     	
     	for (int i = 0 ; (Dis(D,N+i,K)) ; i++){
     		ans += 1;
     		
     	}
    	
     	System.out.println(ans);
    }
    
    static boolean Dis (String D[] , int x , int k){
    	String X = String.valueOf(x);
    	
    	for (int i = 0 ; i <= k-1 ; i++){
    		if (X.contains(D[i])){
    			return true;
    		}
    	}
    	
    	return false;
    }
}
   
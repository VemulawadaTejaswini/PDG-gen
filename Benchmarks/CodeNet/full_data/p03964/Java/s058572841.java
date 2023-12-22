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
    	int T[] = new int [N+1];
    	int A[] = new int [N+1];
    	int t[] = new int [N+1];
    	int a[] = new int [N+1];
    	
    	for (int i = 1 ; i <= N ; i++){
    		T[i] = sc.nextInt();
    		A[i] = sc.nextInt();
    	}
    	
    	t[1] = T[1];
    	a[1] = A[1];
    	
    	for (int i = 1 ; i <= N-1 ; i++){

        	int flg = 0;

        	
    		for (int s = 0 ; flg == 0 ; s++) {
    			
    			for (int k = 0 ; (k <= s) && (flg == 0)  ; k++){
    				if ( T[i+1] * (a[i] + k) == (t[i] + (s-k)) * A[i+1]){
    					t[i+1] = t[i] + (s-k);
    					a[i+1] = a[i] + k;
    					flg = 1;
    				}
    			}
    			
    		}
    			
    	}
    	
    	System.out.println(t[N] + a[N]);
    	

    }	
}
    
   
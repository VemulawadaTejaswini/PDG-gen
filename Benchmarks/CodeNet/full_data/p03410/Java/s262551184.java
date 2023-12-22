import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

	
    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();


        int[] A = new int[N];
        int[] B = new int[N];
        boolean[] C = new boolean[18];

        for(int i=0;i<N;i++){
        	A[i] = in.nextInt();
        }
        for(int i=0;i<N;i++){
        	B[i] = in.nextInt();
        	}
        
        for(int i=0;i<N;i++){
        	for(int j=0;j<N;j++){
        		int num= A[i] + B[j]; 
        		for(int k=0;k<18;k++){
        			if(num>=(131072/Math.pow(2, k))){
        				num-=(131072/Math.pow(2, k));
        				C[k]=!C[k];
        			}
        		}
        		
        	}
        	
        
        }
        int ans = 0;
        for(int i=0;i<18;i++){
        	if(C[i])
        		ans +=(131072/Math.pow(2, i));
        }
        	System.out.println(ans);
        in.close();
    }

	
}

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
    	int x = sc.nextInt();
    	int ans = 0;
    	
    	int a[] = new int [N+2];
    	a[0] = 0;
    	a[N+1] = 0;
    	
    	for (int i = 1 ; i <= N ; i++){
    		a[i] = sc.nextInt();
    	}
    	
    	for (int j = 1 ; j <= N ; j++){
    	  if (a[j-1] + a[j] > x){
    		ans = ans + (a[j-1] + a[j] - x);
    		a[j] = a[j] - (a[j-1] + a[j] - x);
    	  }
    	}
    	
    	System.out.println(ans);
    	
    	
    }
}
    
   
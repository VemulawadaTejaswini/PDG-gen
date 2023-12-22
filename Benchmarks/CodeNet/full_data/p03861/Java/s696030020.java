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
    	long a = sc.nextLong();
    	long b = sc.nextLong();
    	long x = sc.nextLong();

        long b2 = b / x;
        long a2 = a / x;
        
        if (a % x == 0){
        	a2 = a2 - 1;
        }
        
        long ans=0;
        ans = b2 - a2;
        
        System.out.println(ans);
    }	
}
    
   
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Main{
	static int gcd(int a, int b) 
    { 
        if (a == 0) 
            return b; 
        return gcd(b % a, a); 
    } 
	
	static int findGCD(int a,int b,int c) 
    { 
        int result = a; 
        result = gcd(b,result);
        result = gcd(c,result);
        return result; 
    } 
	
    public static void main(String[] args) throws IOException {
        	Scanner sc = new Scanner(System.in);
        	int k = sc.nextInt();
        	int sum = 0;
        	for(int i=1;i<=k;i++) {
        		for(int j=1;j<=k;j++) {
        			for(int a=1;a<=k;a++) {
                		sum+=findGCD(i,j,a);
                	}
            	}
        	}
        	System.out.println(sum);
    }
}

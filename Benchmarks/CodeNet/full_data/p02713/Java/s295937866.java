import  java.io.*;
import  java.math.*;
import  java.util.*;


public class Main {
    public static void main(String[] args) {
    	Scanner cin = new Scanner(System.in);
    	int n = cin.nextInt();
    	long sum = 0;
    	for(int i = 1; i <= n; i++){
    		for(int j = 1; j <= n; j++){
    			for(int k = 1; k <= n; k++){
    				sum += gcd(gcd(i,j),k);
    			}
    		}
    	}
    	System.out.println(sum);
    }
    public static int gcd(int a,int b)
    {
        if(a==0) return b;
        if(b==0) return a;
        if(!(a%2==1)&&!(b%2==1))
        {
            return gcd(a>>1,b>>1)<<1;
        }
        else if(!(b%2==1))
        {
            return gcd(a,b>>1);
        }
        else if(!(a%2==1))
        {
            return gcd(a>>1,b);
        }
        else
        {
            return gcd(Math.abs(a-b),Math.min(a,b));
        }
    }
}
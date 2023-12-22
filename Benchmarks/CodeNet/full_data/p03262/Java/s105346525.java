import java.util.*;
import java.lang.*;
import java.io.*;


public class Main {
    public static int gcd(int x, int y){
    	if(x<y) return gcd(y,x);
    	if(y==0) return x;
    	return gcd(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] x = new int[N];
        for(int n=0;n<N;n++) x[n]=sc.nextInt();
        
        int D = Math.abs(X-x[0]);
        for(int n=1;n<N;n++){
        	D = gcd(D,Math.abs(X-x[n]));
        }
        System.out.println(D);
    }
}

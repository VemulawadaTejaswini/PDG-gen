

import java.util.Arrays;
import java.util.Scanner;
class Main{
	   public static void main(String[] args){
	  Scanner scan =  new Scanner(System.in);
	   int a = scan.nextInt();
       int b = scan.nextInt();
       int c = scan.nextInt();
       int f=0;
       int z =0;
       double g =0;
       double d[] = new double[a];
       int e=0;
       double x = 0;
       double y=0;
       for(int i=0;i<a;i++){
    	   d[i] = scan.nextDouble();
       }
       Arrays.sort(d);
       for(int i=0;i<=(a-1)/2;i++){
    	    g=d[i];
    	   d[i]=d[a-1-i];
    	   d[a-1-i]=g;
       }
       for(int i=b;i<a;i++){
    	   if(d[0]==d[i]){
    		   e++;
    	   }
       }
       for(int i=0;i<b;i++){
    	   x =x+d[i]; 
       }
       System.out.println((double)x/b);
       if(e+1<=b){
    	   for(int i=0;i<d.length;i++){
    		   if(d[b-1]==d[i]){
    			   f++;
    		   }}
        for(int i=0;i<b-1;i++){
    			   if(d[b-1]==d[i]){
    			   z++;
    		   }
    		 }
               double[] n =a(f);
               
               System.out.println(n[z+1]);
       }else{
    	   double[] t =a(e);
    	   for(int i=b;i<=c;i++){
    		   y = y + t[i];
    	   }
    	   System.out.println(y);
       }
	   }
	

public static double[] a(int f) {

    double[] n = new double[1];
    n[0] = 1;
    for (int i = 0; i < f+1; i++) {
        n = n(n);
    }
 return n;
}
public static double[] n(double[] n) {

	        double[] is = new double[n.length + 1];
	        is[0] = n[0];
	        for (int i = 1; i < n.length; i++) {
	            is[i] = n[i - 1] + n[i];
	        }
	        is[is.length - 1] = 1;
	        return is;
	    
}}
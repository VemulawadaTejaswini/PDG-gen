import java.util.Scanner;
import java.lang.System;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] h = new int[3*N/4];
		
		int ind = 3*N/4;
		
		for(int i=ind;i>0;i--){
		    h[i-1]=i+1;
		}
		for (int hh : h) {
		    double dis = (4/N)-(1/hh);
		    int[] m = new int[2*(int)dis];
		    for(int j=(int)dis;j>0;j--){
		        m[j-1]=j+1;
		    }
		    for(int mm : m){
		        double z = (N*hh*mm)/((4*hh*mm)-(N*mm)-(N*hh));
		        int zn = (int)z;
		        if(z==(double)zn){
		            System.out.println(hh+" "+mm+" "+zn);
		            System.exit(0);
		        }
		        
		    }
	     
		}

	}
}
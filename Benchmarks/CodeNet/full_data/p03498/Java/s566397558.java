import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int n=0;n<N;n++) a[n]=sc.nextInt();
        
        int absMax=0;
        for(int n=0;n<N;n++){
        	if(Math.abs(a[absMax]) <= Math.abs(a[n])){
        		absMax = n;
        	}
        }
        
        if(a[absMax]==0){
        	System.out.println("0");
        }else if(a[absMax]>0){
        	System.out.println(2*N-2);
        	for(int n=0;n<N;n++){
        		if(n!=absMax)System.out.println((absMax+1)+" "+(n+1));
        	}
        	for(int n=1;n<=N-1;n++){
        		System.out.println(n+" "+(n+1));
        	}
        }else{
        	System.out.println(2*N-2);
        	for(int n=0;n<N;n++){
        		if(n!=absMax)System.out.println((absMax+1)+" "+(n+1));
        	}
        	for(int n=N;n>=2;n--){
        		System.out.println(n+" "+(n-1));
        	}
        }
    }
}
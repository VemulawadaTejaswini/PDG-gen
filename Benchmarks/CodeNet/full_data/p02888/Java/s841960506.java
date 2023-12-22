import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{

public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
       int n=s.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){arr[i]=s.nextInt();}
       	Arrays.sort(arr);
       long count=0;
        for(int h=0;h<n-2;h++){
            int k1=h+2;
            for(int j=h+1;j<n-1;j++){
                while(k1<n &&arr[h]+arr[j]>arr[k1]){
                    k1++;
                }
                if(k1>j){count+=k1-j-1;}
            }
        }
       	
       System.out.println(count); 
    }
}
    
  











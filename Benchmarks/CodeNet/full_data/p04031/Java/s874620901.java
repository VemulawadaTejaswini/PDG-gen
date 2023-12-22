import java.io.*;
import java.util.*;
public class Main{
	public static void main(String args[]){
    	Scanner in = new Scanner(System.in);
      	int n = in.nextInt();
      	int a[] = new int[n];
      	int ans = Integer.MAX_VALUE;
      	for(int i=0;i<n;i++){
        	a[i] = in.nextInt();
        }
      	for(int i=-100;i<=100;i++){
        	int ans1 =0;
          	for(int j =0; j < n ;j++){
            	ans1+=(i-a[j])*(i-a[j]);
            }
          	ans = Math.min(ans,ans1);
        }
   		System.out.println(ans);
    }

}
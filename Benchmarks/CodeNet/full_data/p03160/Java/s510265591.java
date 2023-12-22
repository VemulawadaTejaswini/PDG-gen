//import java.util.Random;
//import java.util.Scanner;public class Main {public static void main(String[]a){Random r=new Random();Scanner s=new Scanner(System.in);while(true){int p=Math.abs(r.nextInt())%100;int q=Math.abs(r.nextInt())%100;System.out.println(p+" * "+q+" = ");int o=0;while(o!=p*q)o=s.nextInt();}}}

import java.util.Scanner;
public class Main{
	public static void main(String[]args){
    	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[]h=new int[n];
      for(int i=0;i<n;i++)h[i]=sc.nextInt();
      int dp[]=new int[n+3];
      dp[1]=Math.abs(h[1]-h[0]);
      for(int i=0;i<n-2;i++){
    	  dp[i+2]=Math.min(dp[i+1]+Math.abs(h[i+2]-h[i+1]),dp[i]+Math.abs(h[i+2]-h[i]));		  
      }
     // for(int i=0;i<n;i++)System.out.println(dp[i]);
      //System.out.println();
      System.out.println(dp[n-1]);
      
      sc.close();
    }
  public static int min(int a,int b){return Math.min(a,b);}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scn=new Scanner(System.in);
       int n=scn.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
    	   arr[i]=scn.nextInt();
       }
       int[] dp=new int[n];
       dp[0]=0;
       for(int i=1;i<n;i++){
    	   int option1=Math.abs(arr[i]-arr[i-1])+dp[i-1];
    	   int option2;
    	   if(i==1){
    		   option2=Integer.MAX_VALUE;
    	   }
    	   else{
    	    option2=Math.abs(arr[i]-arr[i-2])+dp[i-2];
    	   }
    	   dp[i]=Math.min(option1, option2);
       }
       System.out.println(dp[n-1]);
	}

}

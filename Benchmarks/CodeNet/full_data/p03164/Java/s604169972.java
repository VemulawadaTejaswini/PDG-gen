import java.util.Scanner;

public class Main{
  
  
  static long max(long a,long b) {
  		return a>b ? a: b;
  	} 
  static long knapsack(int W, int arr[],int val[],int n){
  		
        if(n==0 ||  W == 0)
        return 0;

        else if(arr[n-1]>W)
        return knapsack(W, arr, val, n-1);

        else
        return max(val[n-1]+knapsack(W-arr[n-1], arr, val, n-1), knapsack(W, arr, val, n-1));
  
  }
	public static void main(String [] args){
    	Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();
      	int W=sc.nextInt();
      	int arr[]=new int[n];
      	int val[]=new int[n];
      	for(int i=0;i<n;i++){
        	arr[i]=sc.nextInt();
          	val[i]=sc.nextInt();
        }
      	long res = knapsack(W,arr,val,n);
      	System.out.println(res);
    }
}
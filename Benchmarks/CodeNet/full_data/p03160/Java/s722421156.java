import java.util.*;

public class Main{
	static Scanner sc = new Scanner(System.in);
	static int[] inputArray(int size){
		int arr[] = new int[size];
		for(int i=0;i<size;i++)arr[i]=sc.nextInt();
		return arr;
	}
	public static void main(String[] args){
		int[] arr = inputArray(sc.nextInt());
		int[] dp = new int[arr.length];
		dp[0]=0;
		dp[1]=(int)Math.abs(arr[1]-arr[0]);
		for(int i=2;i<dp.length;i++){
			dp[i]=Math.min(dp[i-1]+(int)Math.abs(arr[i-1]-arr[i]),dp[i-2]+(int)Math.abs(arr[i-2]-arr[i]));
		}
		//System.out.println(Arrays.toString(dp));
		System.out.println(dp[arr.length-1]);
	}
}
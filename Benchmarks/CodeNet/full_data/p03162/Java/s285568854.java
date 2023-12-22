import java.util.Scanner;
public class Main{
	
	
	private static Scanner sc=new Scanner(System.in);
	
	private static int dp[][];
	
	public static int maxHappiness(int arr[][],int day,int act){
		if(day>=arr.length)
			return 0;
		
		if(dp[day][act]!=0)
			return dp[day][act];
		
		int curHappiness=Integer.MIN_VALUE;
		
		for(int i=0;i<3;i++){
			if(i==act)
				continue;
			curHappiness=Math.max(curHappiness,maxHappiness(arr,day+1,i)+arr[day][i]);
		}
		dp[day][act]=curHappiness;
		return curHappiness;
		
	}
	
	
	public static void main(String []args){
		
		int n=sc.nextInt();
		int arr[][]=new int[n][3];
		dp=new int[n][3];
		for(int i=0;i<n;i++){
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
			arr[i][2]=sc.nextInt();			
		}
		
	
		
		int a=maxHappiness(arr,1,0)+arr[0][0];
		int b=maxHappiness(arr,1,1)+arr[0][1];
		int c=maxHappiness(arr,1,2)+arr[0][2];
		
		System.out.println(Math.max(a,Math.max(b,c)));
		
	}
}
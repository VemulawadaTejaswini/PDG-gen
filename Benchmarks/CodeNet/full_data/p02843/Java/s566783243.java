import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		boolean[] dp=new boolean[100001];
		int[] p={100,101,102,103,104,105};
		dp[0]=true;
		for(int i=0; i<6; i++){
			for(int j=p[i]; j<=100000; j++){
				if(dp[j-p[i]]){
					dp[j]=true;
				}
			}
		}
		if(dp[x]){
			System.out.println(1);
		}else{
			System.out.println(0);
		}
	}
}

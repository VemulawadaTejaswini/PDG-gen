import java.util.Scanner;

public class Main{
	public static boolean solve(int n){
		if(n<100){
			return false;
			}
		if(n>=100&&n<=105){
			return true;
			}
		if(n>105 && n<200){
			return false;
			}
		boolean[] dp = new boolean[n+1];
		dp[100] = true;dp[101] = true;dp[102] = true;dp[103] = true;dp[104] = true;dp[105] = true;
		for(int i = 200;i<n+1;i++){
			dp[i] = (dp[i-100]||dp[i-101]||dp[i-102]||dp[i-103]||dp[i-104]||dp[i-105]);}
		return dp[n];
			}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(solve(n)){
			System.out.println(1);
			}
		else{
			System.out.println(0);
			}
		}
	}
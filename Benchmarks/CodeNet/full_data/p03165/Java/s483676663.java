import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		String dp[][]=new String[s.length()+1][t.length()+1];
		for(int i=0;i<=s.length();i++){
			for(int j=0;j<=t.length();j++){
              	if(i==0 || j==0){
                  dp[i][j]="";
                  continue;
                }
				if(s.charAt(i-1)==t.charAt(j-1)){
					dp[i][j]=dp[i-1][j-1]+s.charAt(i-1);
				}
				else{
					dp[i][j]=dp[i-1][j].length()>dp[i][j-1].length()?dp[i-1][j]:dp[i][j-1];
				}
			}
		}
		System.out.println(dp[s.length()][t.length()]);
	}
}
import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		int dp[][]=new int[s.length()+1][t.length()+1];
		for(int i=1;i<=s.length();i++){
			for(int j=1;j<=t.length();j++){
              if(i==0 || j==0){
                dp[i][j]=0;
                continue;
              }
			  if(s.charAt(i-1)==t.charAt(j-1)){
				dp[i][j]=dp[i-1][j-1]+1;
			  }
			  else{
				dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
			  }
			}
		}
      	int index=dp[s.length()][t.length()];
      	int temp=index;
		char []ans=new char[index+1];
        ans[index]='\u0000';
        int i=s.length();
     	int j=t.length();
        while(i>0 && j>0){
          if(s.charAt(i-1)==t.charAt(j-1)){
            ans[index-1]=s.charAt(i-1);
            i--;
            j--;
            index--;
          }
          else if(dp[i-1][j]>dp[i][j-1]){
            i--;
          }
          else{
            j--;
          }
        }
        for(int k=0;k<=temp;k++){
          System.out.print(ans[k]);
        }
	}
}
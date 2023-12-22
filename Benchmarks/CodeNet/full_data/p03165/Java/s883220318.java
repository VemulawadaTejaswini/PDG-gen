import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	  Scanner scn = new Scanner(System.in);
	 String a = scn.next();
	 String b = scn.next();
	 int[][]dp = new int[a.length()+1][b.length()+1];
	 for(int i=a.length()-1;i>=0;i--)
	 {
		 for(int j=b.length()-1;j>=0;j--)
		 {
			 if(a.charAt(i)==b.charAt(j))
			 {
				 dp[i][j]=1+dp[i+1][j+1];
			 }else {
				 int o1 = dp[i+1][j];
				 int o2 = dp[i][j+1];
				 dp[i][j]=Math.max(o1, o2);
			 }
		 }
	 }
	 String res="";
	 int i=0,j=0;
	 while(i<a.length()&&j<b.length())
	 {
		 if(dp[i][j]==dp[i+1][j+1]+1)
		 {
			 res+=a.charAt(i);
			 i++;
			 j++;
		 }else if(dp[i][j]==dp[i+1][j])
		 {
			 i++;
		 }else {
			 j++;
		 }
	 }
	 System.out.println(res);
	 
}
}

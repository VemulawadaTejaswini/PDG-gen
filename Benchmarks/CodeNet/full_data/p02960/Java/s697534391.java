
import java.util.Scanner;

public class Main {
	static int mod(String num, int a) 
    { 
          
        // Initialize result 
        int res = 0; 
  
        // One by one process all digits of 'num' 
        for (int i = 0; i < num.length(); i++) 
            res = (res * 10 + (int)num.charAt(i) 
                                     - '0') % a; 
  
        return res; 
    } 
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String cur=scan.next();
//		int dp[]=new int[13];
		int n=cur.length();
		long sum=0;
//		String zero=cur.replace('?','0');
//		int modx=mod(zero,13);
		int dp[][]=new int[n+1][13];
		dp[0][0]=1;
		for(int i=0;i<n;i++)
		{
			int c;
			if(cur.charAt(i)=='?') {c=-1;}
			else {
				c=cur.charAt(i)-'0';
			}
			for(int num=0;num<=9;num++)
			{
				if(c!=-1 && c!=num)continue;
				for(int mod_prev=0;mod_prev<13;mod_prev++)
				{
					int mod_pos=(mod_prev*10+num)%13;
					dp[i+1][mod_pos]+=dp[i][mod_prev];
					dp[i+1][mod_pos]%=1000000007;
					
				}
			}
		}
		System.out.println(dp[n][5]);
		
		
	}
}

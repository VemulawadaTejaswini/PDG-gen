import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc =new Scanner(System.in);
		String s = sc.nextLine();
		
		int l = s.length();
		char[] c= s.toCharArray();
		int[] num = new int[l];
		for(int i=0;i<l;i++) {
			if(c[i]!='?') {
				num[i]=(int)c[i]-48;
			}
			else {
				num[i]=-1;
			}
		}
		
		
		long dp[][]=new long[l+1][13];//dp[i][j]=下からi桁まで考えて、あまりがjの場合の数
		int tmp;
		int mod[]={4,1,10,9,12,3};
		if(num[l-1]!=-1) {
			dp[1][num[l-1]]=1;
		}
		else {
			for(int j=0;j<=9;j++) {
				dp[1][j]=1;
			}
		}
		
		for(int i=2;i<=l;i++) {
			if(num[l-i]!=-1) {
				tmp=(num[l-i]*mod[i%6])%13;
				for(int j=0;j<13;j++) {
					dp[i][(j+tmp)%13]=dp[i-1][j];
				}
			}
			else{
				tmp = mod[i%6]%13;
				for(int j=0;j<13;j++) {
					for(int k=0;k<=9;k++) {
						dp[i][(j+tmp*k)%13]+=dp[i-1][j];
					}
				}
				for(int j=0;j<13;j++) {
					dp[i][j]=dp[i][j]%((int)Math.pow(10, 9)+7);
				}
				
			}

			
		}
		
		
		System.out.println(dp[l][5]);


}
	
	
	
}




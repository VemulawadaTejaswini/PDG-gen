import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int ans=0;
		int t=0;
		int S1=X+N-Y+1;
		int S2=Y-1;
		int S3 = N-X;
		for(int k =1;k!=N;k++) { 
			ans=0;
			//System.out.println("s1"+S1+"k"+k);	
			if(S1>=k) {
				//System.out.println("1");
				ans=S1-k+1;
			}
			 int g=1;
			 while(X+g!=Y) {
				 if(X+g>=k) {
				//	 System.out.println("2");
					 ans++;
				 }else if(N-(X+g)>=k) {
				//	 System.out.println("3");
					 ans++;
				 }
				 
				 
				 
				 g++;
			 }
			
			
		System.out.println(+ans);	
		}
	}

}

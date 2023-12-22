import java.util.Scanner;
public class Main {
	static int N;
	static int b=0;
	public static String dfs(int a) {
		if(a%10==7) {
			b=1;
			return "Yes";
		}
		else if(a<10&&b==0) {
			return "No";
		}
		else {
			String ans="No";
			for(int i=0;i<3;i++) {
				ans=dfs((a-a%10)/10);
			}
			return ans;
		}
	}
	
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	N=sc.nextInt();
	System.out.println(dfs(N));
	}
}

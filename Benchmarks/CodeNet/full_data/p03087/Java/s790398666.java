import java.util.Scanner;

public class Main{
	static int ans = 0;
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		String s=sc.next();
		for(int i=0;i<m;i++) {
			int ans=0;
			int l=sc.nextInt(); int r=sc.nextInt();
			String s2=s.substring(l-1,r);
			//System.out.println(s2);
			for(int j=0;j<s2.length()-1;j++) {
				if(s2.substring(j, j+2).equals("AC"))ans++;
			}
			System.out.println(ans);
		}
	}
}

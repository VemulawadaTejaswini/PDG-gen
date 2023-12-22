import java.util.Scanner;

public class Main{
	static int ans = 0;
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int start[]=new int[n];
		int count=0;
		String s=sc.next();
		for(int j=0;j<s.length()-1;j++) {
			if(s.substring(j, j+2).equals("AC")) {
				start[count]=j;
				count++;
			}
		}
		for(int i=0;i<m;i++) {
			ans=0;
			int l=sc.nextInt();int r=sc.nextInt();
			for(int j=0;j<count;j++) {
				if(l-1<=start[j]&&start[j]+2<=r)ans++;
			}
			System.out.println(ans);
		}
		}
	}


import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int q=scan.nextInt();
		String s=scan.next();
		int g[]=new int[n];
		for(int i=0;i<n;i++) {
			g[i]=1;
		}
		int ans=0;
		for(int i=0;i<q;i++) {
			char ch=scan.next().charAt(0);
			char ch2=scan.next().charAt(0);
			for(int j=0;j<n;j++) {
				char ch3=s.charAt(j);
				if(ch3==ch) {
					if(ch2=='L') {
						if(j==0) {
							ans+=g[j];
							g[j]=0;
							continue;
						}
						g[j-1]+=g[j];
						g[j]=0;
					}
					else {
						if(j==n-1) {
							ans+=g[j];
							g[j]=0;
							continue;
						}
						g[j+1]+=g[j];
						g[j]=0;
					}
				}
			}
		}
		System.out.println(n-ans);
	}
}
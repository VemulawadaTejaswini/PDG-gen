import java.util.Scanner;

public class Main{
	static int ans = 0;
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		String s=sc.next();
		for(int i=0;i<m;i++) {
			int r=sc.nextInt();int l=sc.nextInt();
			ans=0;
			for(;;) {
				if(s.indexOf("AC",r-1)==-1)break;
				if(s.indexOf("AC",r-1)+2<=l)ans++;
				r+=2;
			}
			System.out.println(ans);
			}
		}
}


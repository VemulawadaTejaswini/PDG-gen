import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		boolean[] ac=new boolean[n+1];
		boolean[] wa=new boolean[n+1];
		Arrays.fill(ac, false);
		Arrays.fill(wa, false);
		int acn = 0,wan = 0;
		while(m-->0) {
			int a=sc.nextInt();
			String s=sc.nextLine();
			if(s.equals(" WA")) {
				wa[a] = true;
			}
			if(s.equals(" AC")) {
				ac[a] = true;
			}
		}
		 for(int i=0;i<=n;i++) {
			 if(ac[i])
				 acn++;
			 if(wa[i])
				 wan++;
		 }
		 System.out.print(acn+" "+wan);
	}
}

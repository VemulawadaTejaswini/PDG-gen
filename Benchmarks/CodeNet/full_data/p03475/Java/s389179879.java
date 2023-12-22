
import java.util.Scanner;
public class ABC080{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] c=new int[n];
		int[] s=new int[n];
		int[] f=new int[n];
		for(int i=0;i<n-1;i++) {
			c[i]=sc.nextInt();
			s[i]=sc.nextInt();
			f[i]=sc.nextInt();
		}

		for(int i=0;i<n-1;i++) {
			int now=0;
			for(int j=i;j<n-1;j++) {
				if(now<=s[j]) {
					now=s[j]+c[j];
				}else {
					int buf=s[j];
					while(now>buf) {
						buf+=f[j];
					}
					now=buf+c[j];
				}
			}
			System.out.println(now);
		}
		System.out.println(0);
	}
}
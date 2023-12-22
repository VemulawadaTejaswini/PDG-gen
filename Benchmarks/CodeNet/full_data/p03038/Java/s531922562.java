import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c[]=new int[a];
		int d[][]=new int[b][2];
		for(int i=0;i<a;i++) {
		c[i]=scan.nextInt();
		}
		for(int i=0;i<b;i++) {
			d[i][0]=scan.nextInt();
			d[i][1]=scan.nextInt();
		}
		Arrays.sort(d,(x, y)->Integer.compare(x[0],y[0]));
		Arrays.sort(c);
		for(int i=0;i<b;i++) {
			if(c[0]<d[i][1]) {
				for(int j=0;j<d[i][0];j++) {
					if(c[j]>=d[i][1]) {
						break;
					}
					c[j]=d[i][1];
				}
			}
			Arrays.sort(c);
		}
		long ans=0;
		for(int i=0;i<a;i++) {
			ans+=c[i];
		}
		System.out.println(ans);
	}
}

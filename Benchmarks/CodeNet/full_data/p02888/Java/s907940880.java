
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();

		int c=0;
		for(int x=0;x<n-2;x++) {
			for(int y=x+1;y<n-1;y++) {
				for(int z=y+1;z<n;z++) {
					if(a[x]<a[y]+a[z]&&a[y]<a[z]+a[x]&&a[z]<a[y]+a[x])
						c++;
				}
			}
		}
		System.out.println(c);

	}

}

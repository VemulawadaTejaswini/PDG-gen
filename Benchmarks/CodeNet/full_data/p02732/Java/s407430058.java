
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int a[]=new int[n+1],a2[]=new int[n];

		for(int i = 0;i<n;i++) {
			a[i]=0;
		}
		for(int i = 0;i<n;i++) {
			a2[i]=scan.nextInt();
			a[a2[i]]+=1;

		}
		scan.close();
		long ans=0;
		for(int i=1;i<=n;i++) {
			if(a[i]!=0)ans+=a[i]*(a[i]-1)/2;
		}
		for(int i=0;i<n;i++) {
			if(a[a2[i]]-2>=0)System.out.println(ans- a[a2[i]]*(a[a2[i]]-1)/2+ (a[a2[i]]-1)*(a[a2[i]]-2)/2);
			else System.out.println(ans- a[a2[i]]*(a[a2[i]]-1)/2 );

		}

	}
}


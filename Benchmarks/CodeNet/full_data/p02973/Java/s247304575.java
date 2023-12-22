import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int i,j,ans=0,min=n+1;
		for(i=0;i<n;i++)a[i]=sc.nextInt();
		int cnt=0;
		for(i=0;i<n-1;i++) {
			cnt++;
			ans=0;
			for(j=i+1;j<n;j++) {
			if(a[i]>=a[j])
				ans++;
			}
			ans+=cnt;
			min=Math.min(ans,min);
		}
		System.out.println(min);		
    }
}
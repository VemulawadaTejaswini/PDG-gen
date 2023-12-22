import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		int[] a=new int[N];
		int i,k,cnt,ans=0;
		for(i=0;i<N;i++) {
			a[i]=sc.nextInt();
		}
		for(;;) {
			cnt=0;
			for(i=0;i<N;i++) {
				if(a[i]%2==0) {
					a[i]=a[i]/2;
					cnt++;
				}else break;
			}
			if(cnt==N)ans++;
			else break;
		}
		System.out.println(ans);
	}
}
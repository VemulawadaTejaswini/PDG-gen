import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		long[] a =new long[n];
		long[] b =new long[n];
		long ans=0;
		for(int i=0; i<n; i++){
			a[i]=sc.nextLong();
			b[i]=sc.nextLong();
			if((a[i] & ~k)==0){
				ans+=b[i];
			}
		}
		for(int i=30; i>=0; i--){
			if((k>>i & 1)==1){
				int x=((k>>i)<<i)-1;
				int tt=0;
				for(int j=0; j<n; j++){
					if((a[j] & ~x)==0){
						tt+=b[j];
					}
				}
				ans=Math.max(ans,tt);
			}
		}
		System.out.println(ans);
	}
}

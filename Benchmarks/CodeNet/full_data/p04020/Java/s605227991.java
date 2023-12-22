import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long ans=0;
		long a1=0;
		long[] a2=new long[N];
		for(int i = 0; i<N; i++){
			long a = sc.nextLong();
			if(a%2!=0 && a1%2!=0){
				ans++;
			}
			ans+=a/2;
			a1=a%2;
		}
		System.out.println(ans);
	}
}
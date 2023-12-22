import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long a1=sc.nextLong();
		long ans=0;
		long[] a2=new long[N];
		a2[0]=a1;
		for(int i = 1; i<N; i++){
			long a = sc.nextLong();
			ans+=Math.min(a,a1);
			a2[i]=a-Math.min(a,a1);
			a2[i-1]-=Math.min(a,a1);
			a1=a-Math.min(a,a1);;
		}
		for(int i = 0; i<N; i++){
			ans+=a2[i]/2;
		}
		System.out.println(ans);
	}
}
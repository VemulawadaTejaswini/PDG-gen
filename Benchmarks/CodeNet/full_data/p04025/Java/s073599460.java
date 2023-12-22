import java.util.*;
public class Main {
		
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int N=in.nextInt();
		int[]a=new int[N];
		for (int i = 0; i < N; i++) {
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		int num=(a[N-1]+a[N-2])/2;
		int c=0;
		for (int i = 0; i < a.length; i++) {
			if(a[0]!=a[i]) {
				c++;
				break;
			}
		}
		if(c==0) {
			System.out.println(0);
		}
		else {
			int sum=0;
			for (int i = 0; i < a.length; i++) {
				sum=sum+((a[i]-num)*(a[i]-num));
			}
			System.out.println(sum);
		}
	}
}
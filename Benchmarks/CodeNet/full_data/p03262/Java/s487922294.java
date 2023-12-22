import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),x=sc.nextInt(),ans=Math.abs(sc.nextInt()-x);
		for(int i=1;i<n;i++) {
			int temp = Math.abs(sc.nextInt()-x);
			ans = gcd(ans,temp);
		}
		sc.close();
		System.out.println(ans);
	}

	static int gcd(int a, int b) {
		if(a<b) {
			int temp = a;
			a=b;
			b=temp;
		}
		int r=a%b;
		while(r!=0) {
			a=b;
			b=r;
			r=a%b;
		}
		return b;
	}
}
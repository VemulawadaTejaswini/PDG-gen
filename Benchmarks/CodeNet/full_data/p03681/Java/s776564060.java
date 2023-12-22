
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();

		int deka=Math.max(N,M);
		int mini=Math.min(N,M);

		long kotae1=1;
		long kotae2=1;
		if(deka==mini) {
			kotae1=Kaijyo_mod(deka,1000000007);
			System.out.println((kotae1*kotae1*2)%1000000007);
		}
		else if(deka-1==mini) {
			kotae1=Kaijyo_mod(deka,1000000007);
			kotae2=Kaijyo_mod(mini,1000000007);
			System.out.println((kotae1*kotae2)%1000000007);
		}
		else {
			System.out.println(0);
		}
	}

	public static long Kaijyo_mod(int n,int mod) {
		long aa=1;

		for(int i=n; i>=2; i--) {
			aa*=i;
			aa=aa%mod;
		}
		return aa;
	}
}
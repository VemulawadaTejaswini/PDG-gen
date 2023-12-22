import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();

		int[] M=new int[N];

		for(int i=0;i<N;i++) M[i]=sc.nextInt();

		Arrays.sort(M);

		int gcd=M[0];

		for(int i=1;i<N;i++) {
			gcd=GCD(gcd,M[i]);
		}

		System.out.println(gcd);

		sc.close();
	}

	public static int GCD(int a,int b) {
		if(a<b) {
			int w=a;
			a=b;
			b=w;
		}
		if(b==0) return a;
		return GCD(a%b,b);
	}

}

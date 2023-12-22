import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Calc calc=new Calc();

		calc.abc125_C();

	}

}

class Calc{

	int N;
	int[] box;
	int[] L;
	int[] R;

	public void abc125_C() {

		Scanner sc=new Scanner(System.in);

		N=sc.nextInt();

		box=new int[N];
		L=new int[N+1];
		R=new int[N+1];

		L[0]=R[N]=0;

		for(int i=0;i<N;i++) box[i]=sc.nextInt();

		for(int i=0;i<N;i++) L[i+1]=gcd(L[i],box[i]);

		for(int i=N-1;i>=0;i--) R[i]=gcd(R[i+1],box[i]);

		int max=0;

		for(int i=0;i<N;i++) max=Math.max(max, gcd(L[i],R[i+1]));

		System.out.println(max);

		sc.close();

	}

	// O(log MAX_X)
	public int gcd(int a,int b) {
		if(a<b){
			int w=a;
			a=b;
			b=w;
		}
		if(b==0) return a;
		return gcd(a%b,b);
	}

}

import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int X=sc.nextInt();

		int[] michi=new int[N+1];
		for(int i=1; i<=M; i++) {
			michi[sc.nextInt()]=1;
		}

		int keiro1=0;
		int keiro2=0;

		for(int i=X; i>=0; i--) {
			keiro1+=michi[i];
		}

		for(int i=X; i<=N; i++) {
			keiro2+=michi[i];
		}

		System.out.println(Math.min(keiro1, keiro2));
	}
}
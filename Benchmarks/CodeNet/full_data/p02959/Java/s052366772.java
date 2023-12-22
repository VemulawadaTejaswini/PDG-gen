import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		long tmp=0L;
		long[] town =new long[N+1];
		for(int i=0; i<N+1; i++) {
			town[i]=sc.nextLong();
		}
		long[] sensi=new long[N];
		for(int i=0; i<N; i++) {
			sensi[i]=sc.nextLong();
		}
		for(int i=0; i<N; i++) {
			if(sensi[i]>=town[i]) {
				tmp+=town[i];
				sensi[i]-=town[i];
				if(sensi[i]>0) {
					if(sensi[i]>=town[i+1]) {
						tmp+=town[i+1];
						sensi[i]-=town[i+1];
						town[i+1]=0;
					}
					else {
						tmp+=sensi[i];
						town[i+1]-=sensi[i];
						sensi[i]=0;
					}
				}
			}
			else {
				tmp+=sensi[i];
				sensi[i]=0;
			}
		}
		tmp+=Math.min(town[N],sensi[N-1]);
		p(tmp);

	}
	public static void p(Object o) {
		System.out.println(o);
	}
}
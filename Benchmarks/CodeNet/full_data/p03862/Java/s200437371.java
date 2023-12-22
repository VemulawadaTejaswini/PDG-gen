import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();
		long x=sc.nextLong();
		long kosu=0;
		long[] ame=new long[N];

		for(int i=0; i<N; i++) {
			ame[i]=sc.nextInt();
		}

		long tmp1=0; long tmp2=0;
		if(N>=3) {
			for(int i=0; i<=N-2; i++) {
				if(ame[i]+ame[i+1]>x) {
					tmp1=ame[i];
					tmp2=ame[i+1];
					if(ame[i]+ame[i+1]-x>ame[i+1]) {
						ame[i]=ame[i]+ame[i+1]-x-ame[i+1];
						ame[i+1]=0;
						kosu+=tmp1-ame[i+0]+tmp2;
					}
					else if(ame[i]+ame[i+1]-x<=ame[i+1]) {
						ame[i+1]=ame[i+1]-(ame[i]+ame[i+1]-x);
						kosu+=tmp2-ame[i+1];
					}
				}
			}
		}
		else if(N==2){
			kosu=Math.max(ame[0]+ame[1]-x,0);
		}
		System.out.println(kosu);
	}
}
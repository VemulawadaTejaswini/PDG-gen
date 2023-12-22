import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int d_set=sc.nextInt();
		int[] naka=new int[d_set];
		long sum=0;

		for(int i=0; i<d_set; i++) {
			naka[i]=sc.nextInt();
			sum+=naka[i];
		}
		long[] a=new long[3];
		for(int i=0; i<3; i++) {
			a[i]=sum/d_set-1+i;
		}

		long tmp=0;
		long min=9223372036854775807l;
		for(int i=0; i<3; i++) {
			tmp=0;
			for(int j=0; j<d_set; j++) {
				tmp+=Math.abs(naka[j]-(j+1+a[i]));
			}
			if(tmp<min) {
				min=tmp;
			}
		}
		System.out.println(min);
		/*for(int i=0; i<d_set; i++) {
			naka[i]=sc.nextInt();
			aa[i]=(naka[i]-(i+1))*(naka[i]-(i+1));
			bb[i]=-2*(naka[i]-(i+1));
			aa_sum+=aa[i];
			bb_sum+=bb[i];
		}
		long min=9223372036854775807l;
		long tmp=1145141919l;
		int sontoki=-114514;
		for(int i=-1000; i<=1000; i++) {
			tmp=d_set*i*i+aa_sum+bb_sum*i;
			if(tmp<min) {
				min=tmp;
				sontoki=i;
			}
		}
		long res=0;
		for(int i=0; i<d_set; i++) {
			res+=Math.abs(naka[i]-i-1-sontoki);
		}
		System.out.println(res);*/
	}
}
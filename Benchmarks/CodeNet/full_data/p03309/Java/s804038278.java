import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int d_set=sc.nextInt();
		int[] naka=new int[d_set];
		long[] aa=new long[d_set];
		long[] bb=new long[d_set];
		long aa_sum=0;
		long bb_sum=0;

		for(int i=0; i<d_set; i++) {
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
		System.out.println(res);
	}
}
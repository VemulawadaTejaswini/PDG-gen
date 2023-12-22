import java.util.Scanner;

class Main{
	static double dist=0;
	static int kaisu=0;
	static int[] x;
	static int[] y;
	static int[] ns;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		x=new int[N];
		y=new int[N];
		ns = new int[N];
		for(int i=0; i<N; i++) {
			ns[i]=i;
		}
		for(int i=0; i<N; i++) {
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}

		permute(ns, ns.length);
		p(dist/(double)kaisu);
	}
	public static void p(Object o) {
		System.out.println(o);
	}
	static long root(long a) {

		int ketasu=0;
		long tmp=a;
		while(tmp>0) {
			ketasu++;
			tmp/=10L;
		}
		int constant=(ketasu+1)/2;	//よく使うので定数化
		if(ketasu>=1) {
			long[] suuji=new long[constant];
			tmp=a;
			for(int i=0; i<constant; i++) {
				suuji[constant-1-i]=a%100L;
				a/=100L;
			}
			long ans=0;
			long kai=0;
			long mae=0;
			if(constant<=1) {
				for(long i=10L; i>=0L; i--) {
					if(suuji[0]>=i*i) {
						return i;
					}
				}
			}
			else {
				for(long i=0L; i<constant; i++) {
					mae+=kai*2L;
					for(long j=9L; j>=0L; j--) {
						if((mae*10+j)*j<=suuji[(int)i]) {
							ans=ans*10+j;
							mae*=10;
							kai=j;
							if(i+1<constant) {
								suuji[(int)i+1]+=(suuji[(int)i]-(mae+j)*j)*100;
							}
							break;
						}
					}
				}
			}
			return ans;
		}
		else {
			return 0L;
		}
	}
	private static void swap(int[] v, int i, int j) {
		int t = v[i]; v[i] = v[j]; v[j] = t;
	}
	public static void permute(int[] v, int n) {
		if (n == 1) {
			kaisu++;
			double tmp=0;
			for(int i=1; i<x.length; i++) {
				tmp+=Math.sqrt((x[ns[i]]-x[ns[i-1]])*(x[ns[i]]-x[ns[i-1]])+(y[ns[i]]-y[ns[i-1]])*(y[ns[i]]-y[ns[i-1]]));
			}
			dist+=tmp;
		}
		else {
			for (int i = 0; i < n; i++) {
				permute(v, n-1);
				if (Math.abs(n) % 2 == 1) {
					swap(v, 0, n-1);
				} else {
					swap(v, i, n-1);
				}
			}
		}
	}
}
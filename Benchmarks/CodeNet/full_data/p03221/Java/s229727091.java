import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int[] kosu=new int[100001];
		long[][] aa=new long[M][3];
		for(int i=0; i<=100000; i++) {
			kosu[i]=0;
		}
		for(int i=0; i<M; i++) {
			long a=sc.nextLong();
			long b=sc.nextLong();
			kosu[(int)a]++;
			aa[i][0]=a*10000000000L+b;
			aa[i][1]=i;
		}
		for(int i=1; i<=100000; i++) {
			kosu[i]=kosu[i-1]+kosu[i];
		}
		quick_sort(aa,0,M-1);
		for(int i=0; i<M; i++) {
			aa[i][2]=i+1;
		}
		long[][] ansss=new long[M+1][2];
		for(int i=0; i<M; i++) {
			ansss[(int)aa[i][1]][0]=aa[i][0];
			long ban=aa[i][0]/10000000000L;
			ansss[(int)aa[i][1]][1]=aa[i][2]-kosu[(int)ban-1];
		}
		String unti="";
		String buri="";
		for(int i=0; i<M; i++) {
			long aaaa=ansss[i][0]/10000000000L;
			unti=String.format("%06d", (int)(aaaa));
			buri=String.format("%06d", (int)(ansss[i][1]));
			System.out.println(unti+buri);
		}
	}
	static void quick_sort(long[][] d, int left, int right) {
		if (left>=right) {
			return;
		}
		long p = d[(left+right)/2][0];
		int l = left, r = right;
		long tmp,tmp1,tmp2;
		while(l<=r) {
			while(d[l][0] < p) { l++; }
			while(d[r][0] > p) { r--; }
			if (l<=r) {
				tmp = d[l][0]; d[l][0] = d[r][0]; d[r][0] = tmp;
				tmp1=d[l][1]; tmp2=d[r][1]; d[l][1]=tmp2; d[r][1]=tmp1;
				l++; r--;
			}
		}
		quick_sort(d, left, r);
		quick_sort(d, l, right);
	}
}

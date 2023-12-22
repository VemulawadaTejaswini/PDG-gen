//package test;
import java.util.*;
public class Main {
	private static int n;
	private static final int  maxn=100000+10;
	private static int[] a=new int[maxn];
	private static int[] b=new int[maxn];
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		for(int i=1;i<=n;i++)
			a[i]=scan.nextInt();
		quickSort(a,1,n);
		long ans=works();
		for(int i=1,t;i*2<=n;i++) {
			t=a[i];a[i]=a[n-i+1];a[n-i+1]=t;
		}
		System.out.println(Math.max(ans, works()));
		return;
	}
	static void quickSort(int array[], int low, int high) {// 传入low=0，high=array.length-1;
		int pivot, p_pos, i, t;// pivot->位索引;p_pos->轴值。
		if (low < high) {
			p_pos = low;
			pivot = array[p_pos];
			for (i = low + 1; i <= high; i++)
				if (array[i] > pivot) {
					p_pos++;
					t = array[p_pos];
					array[p_pos] = array[i];
					array[i] = t;
				}
			t = array[low];
			array[low] = array[p_pos];
			array[p_pos] = t;
			// 分而治之
			quickSort(array, low, p_pos - 1);// 排序左半部分
			quickSort(array, p_pos + 1, high);// 排序右半部分
		}
	}
	static long works() {
		int i,j;initb();
		i=1;j=(n+1)/2;
		b[1]=a[j--];
		if(n%2>0) b[n]=a[j--];
		for(;i<=n;i+=2)
			if(b[i]==0) b[i]=a[j--];
		for(i=n%2>0?n-1:n,j=(n+1)/2+1;i>0;i-=2)
			if(b[i]==0) b[i]=a[j++];
		return count();
	}
	static long count() {
		long val=0;
		for(int i=2;i<=n;i++)
			val+=Math.abs(b[i]-b[i-1]);
		return val;
	}
	static void initb() {
		for(int i=1;i<=n;i++)
			b[i]=0;
		return;
	}
}
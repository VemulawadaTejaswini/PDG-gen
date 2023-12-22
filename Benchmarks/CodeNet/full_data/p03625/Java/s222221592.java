import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] box=new int[N];

		for(int i=0; i<N; i++) {
			box[i]=sc.nextInt();
		}
		quick_sort(box,0,N-1);
		int[] sei=new int[N];
		int counter=0;
		int tmp1=-1;
		int ban=0;

		for(int i=0; i<N; i++) {
			if(tmp1!=box[i]) {
				tmp1=box[i];
				counter=1;
			}
			else {
				counter++;
				if(counter==2) {
					sei[ban]=tmp1;
					counter=0;
					ban++;
				}
			}
		}
		if(ban>=2) {
			long res=sei[ban-1]*sei[ban-2];
			System.out.println(res);
		}
		else {
			System.out.println(0);
		}
	}

	static void quick_sort(int[] d, int left, int right) {
		if (left>=right) {
			return;
		}
		int p = d[(left+right)/2];
		int l = left, r = right, tmp;
		while(l<=r) {
			while(d[l] < p) { l++; }
			while(d[r] > p) { r--; }
			if (l<=r) {
				tmp = d[l]; d[l] = d[r]; d[r] = tmp;
				l++; r--;
			}
		}
		quick_sort(d, left, r);
		quick_sort(d, l, right);
	}
}
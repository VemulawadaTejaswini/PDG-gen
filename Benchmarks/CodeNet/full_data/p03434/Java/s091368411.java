import java.util.*;

class Main {

	static int indexMax(int x[]) {
		int y=-1;
		int max=0;
		for (int i=0;i<x.length;i++) {
			if (x[i]>max) {
				max=x[i];
				y=i;
			}
		}
		return y;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		for (int i=0;i<N;i++) {
			a[i]=sc.nextInt();
		}
		int A=0;
		int B=0;
		int cnt=0;
		while(true) {
			int x=indexMax(a);
			A+=a[x];
			a[x]=0;
			cnt++;
			if(cnt==N) {
				break;
			}

			int y=indexMax(a);
			B+=a[y];
			a[y]=0;
			cnt++;
			if(cnt==N) {
				break;
			}
		}
		System.out.println(A-B);
	}
}
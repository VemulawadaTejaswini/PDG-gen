import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		double ans = 0;
		for (int i=0;i<N;i++) {
			ans+=(double)1/N*Math.pow(0.5,binarysearch(K,i+1));
		}
		System.out.println(ans);
	}

	static int binarysearch(int x,int y) {
		int low=0;
		int high=20;
		if (x<=y) {
			return 0;
		}
		while (low+1<high) {
			int mid=(low+high)/2;
			double guess=y*Math.pow(2,mid);
			if (guess==x) {
				return mid;
			} else if (guess > x) {
				high = mid;
			} else {
				low = mid;
			}
		}
		return high;
	}
}
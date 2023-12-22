
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int j = lowerBound(arr, a[i]);
			if(j==0) {
				arr.add(j, a[i]);
			}else {
				arr.set(j-1, a[i]);
			}
		}
		System.out.println(arr.size());
		sc.close();
	}

	public int lowerBound(ArrayList<Integer> a, int v) {
		int l=-1;
		int r=a.size();
		while(l+1<r) {
			int m = (l+r)/2;
			if(a.get(m) < v) {
				l=m;
			}else {
				r=m;
			}
		}
		return l+1;
	}
}

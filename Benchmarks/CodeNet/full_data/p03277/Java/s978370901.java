import java.util.*;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		int[] copy = Arrays.copyOf(arr, arr.length);
		Arrays.sort(copy);

		int left = 0, right = n;
		long x = (long)n * (long)(n + 1) / 4;
		while(left + 1 < right) {
			int mid = (left + right) / 2;
			int am = copy[mid];
			int[] s = new int[n + 1];
			for (int i = 0; i < n; i++) {
				s[i + 1] = am <= arr[i] ? 1 : -1;
			}
			for (int i = 1; i < n + 1; i++) {
				s[i] += s[i - 1];
			}
			BIT bit = new BIT(2 * n + 1);
			long sum = 0;
			for (int i = 0; i < n + 1; i++) {
				sum += bit.sum(s[i] + n);
				bit.add(s[i] + n, 1);
			}
			if(x <= sum) {
				left = mid;
			} else {
				right = mid;
			}
		}
		System.out.println(copy[left]);
	}
}

class BIT {
	private long[] bit;
 
    public BIT(int size){
        bit = new long[size];
    }
 
    public long sum(int i){
        long s = 0;
        while(0 < i){
            s += bit[i];
            i -= i & -i;
        }
        return s;
    }
 
    public void add(int i, long x){
        while(i < bit.length){
            bit[i] += x;
            i += i & -i;
        }
    }
}


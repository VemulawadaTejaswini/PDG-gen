import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[N];
		int sum = 0;
		int count = 0;

		for(int i=0; i<N; i++){
			a[i] = sc.nextInt();
		}
		//System.out.println(Arrays.toString(a));
		quick_sort(a, 0, N-1);
		//System.out.println(Arrays.toString(a));

		for(int i=0; i<N; i++){
			sum += a[i];
			count++;
			if(sum==x){
				System.out.println(count);
				return;
			}else if(sum>x){
				System.out.println(count-1);
				return;
			}
		}
		System.out.println(N-1);
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
        quick_sort(d, left, r);  // ピボットより左側をクイックソート
        quick_sort(d, l, right); // ピボットより右側をクイックソート
    }
}

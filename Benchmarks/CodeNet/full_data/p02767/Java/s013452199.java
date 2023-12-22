import java.util.Scanner;


public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());	//N人
        int[] xs = new int[N];
        for(int i = 0; i < N; i++) {

        	xs[i] = Integer.parseInt(sc.next());
        }
        quick_sort(xs, 0, xs.length-1);

        int sum = 0;
        int current = 0;
        boolean flg = true;
        for(int i = xs[0]; i <= xs[N-1]; i++) {
        	for(int j = 0; j < N; j++) {
        		int pos = (xs[j]-i) * (xs[j]-i);
        		current += pos;
        	}
        	if (current < sum || flg) {
        		sum = current;
        		flg = false;
        	}
        	current = 0;
        }
        System.out.println(sum);
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
import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int x = sc.nextInt();
	int[] a = new int[N];
	for(int i = 0; i<N; i++) {
	    a[i] = sc.nextInt();
	}
	long ans = 0;
	for(int i = 1; i<N; i++) {
	    long sum = a[i]+a[i-1];
	    if(sum>x) {
		ans += sum-x;
		a[i] = (int)Math.max(0, a[i]-sum);
	    }
	}
	System.out.println(ans);
    }
}
import java.util.*;
class Main{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	long X = sc.nextLong();
	long[] x = new long[N];
	long[] a = new long[N];
	long min = 99999999;
	for(int i = 0; i<N; i++) {
	    x[i] = sc.nextLong();
	    a[i] = Math.abs(x[i] - X);
	    if(a[i] < min) min = a[i];

	}
        if(N == 1) {
            System.out.println(Math.abs(x[0]-X));
            return;
        }
	HashSet<Long> set = new HashSet<Long>();
	set.add((long)1);
	for(long i = 2; i<=min; i++){
	    if(min%i == 0) {
		set.add(i);
	    }
	}
	Long[] coArray = set.toArray(new Long[0]);
	Arrays.sort(coArray, Comparator.reverseOrder());
	for(long c: coArray) {
	    long cnt = 0;
	    for(int i = 0; i<N; i++) {
		if(a[i] % c == 0) {
		    cnt++;
		}
	    }
	    if(cnt==N){
		System.out.println(c);
		return;
	    }
	}

    }
}
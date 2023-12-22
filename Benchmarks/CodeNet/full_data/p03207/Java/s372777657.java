import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N =	sc.nextInt();
	int[] a	= new int[N];
        int max	= 0;
	int maxI = 0;
        for(int i = 0; i<N; i++) {
            int v  = sc.nextInt();
            a[i] = v;
	    if(max < v) {
		max = v;
		maxI = i;
            }
        }
        int result = 0;
	for(int i = 0; i < N; i++) {
            if(i == maxI) {
		result = result + a[i]/2;
            } else{
            	result = result + a[i];
            }
	}
	System.out.println(result);
    }
}

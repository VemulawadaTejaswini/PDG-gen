import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] a = new int[n+1];
	long[] xa = new long[n+1];

	long[] suma = new long[n+1];

	for(int i = 1; i<=n; i++) {
	    a[i] = sc.nextInt();
	}

	for(int i = 1; i<=n; i++) {
            xa[i] = xa[i-1]^a[i];
        }

	for(int i = 1; i<=n; i++) {
            suma[i] = suma[i-1] + a[i];
        }

	int cnt = 0;
	for(int i = 0; i<=n; i++) {
	    for(int j = i+1; j<=n; j++) {
		long xor = xa[j]^xa[i];
		long sum = suma[j]-suma[i];
		if(xor==sum) {
		    cnt++;
		}
	    }
	}
	System.out.println(cnt);

    }
}
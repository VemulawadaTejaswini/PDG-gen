import java.util.Arrays;
import java.util.Scanner;
public class Main {
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
		long x = sc.nextLong();

		long a[] = new long[n];
		long sum = 0;


		for(int i=0;i<n;i++) {
			a[i] = sc.nextLong();
			sum += a[i];
		}

		Arrays.sort(a);

		if(sum == x) {
			System.out.println(n);
		}else {
			int k = 0;
			for(int i=0;i<n;i++) {
				if(x >= a[i]) {
					x -= a[i];
					k += 1;
				}
			}
			if(k == n) {
				k -= 1;
			}
			System.out.println(k);
		}

    }

}
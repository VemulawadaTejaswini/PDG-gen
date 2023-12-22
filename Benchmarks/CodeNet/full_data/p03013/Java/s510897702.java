import java.util.*;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[m+1];

        long mod = (long)1E9+7;

        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }

        long result[] = new long[n + 10];
        result[0] = 1;
        result[1] = 1;
        int index = 0;

        for (int  i = 2; i <= n; i++) {
            if (i == a[index]) {
                result[i] = 0;
            } else if (i == a[index]+1) {
                result[i] = result[i - 2];
                index++;
            } else {
                result[i] = (result[i -1] + result[i - 2]) % mod;
            }
        }

        System.out.println(result[n]);
	}
}
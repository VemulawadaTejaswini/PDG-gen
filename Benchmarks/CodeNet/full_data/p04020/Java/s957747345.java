import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextLong();
        }
		sc.close();
        
        long ans = a[0] / 2;
        a[0] -= ans * 2;
        for(int i=1; i<n; i++){
            if(a[i] + a[i-1] >= 2) a[i] += a[i-1];
            long tmp = a[i] / 2;
            a[i] -= tmp * 2;
            ans += tmp;
        }
        System.out.print(ans);
	}
}

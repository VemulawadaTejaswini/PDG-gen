import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] a = new int [n];
        for(int i = 0 ; i < n; i++) {
        	a[i] = sc.nextInt();
        }

        for(int i = 0; i < m; i++) {
        	Arrays.sort(a);
        	a[a.length-1] = a[a.length-1] / 2;
        }

        long ans = 0;
        for(int tmp : a) {
        	ans += tmp;
        }
        System.out.println(ans);

	}
}
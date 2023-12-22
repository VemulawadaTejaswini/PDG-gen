import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Integer[] a = new Integer[n*3];
        for(int i=0; i<n*3; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(a, Collections.reverseOrder());

        int cnt = 1;
        long sum = 0;
        for(int i=1; i<=n*3; i+=2) {
            if(cnt > n) {
                break;
            } else {
                sum += a[i];
            }
            cnt++;
        }
        System.out.println(sum);
    }
}

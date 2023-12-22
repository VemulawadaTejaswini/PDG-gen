import java.util.Scanner;

/**
 * Created by sonetsuyoshi on 2016/07/31.
 */
public class Main {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] a = new int[N];
        int[] b = new int[N];

        for(int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int count = 0;
        for(int i = 0; i < N; i++) {
            int nextCount = count + b[i];
            if(K <= nextCount) {
                System.out.println(a[i]);
                break;
            }
            count += b[i];
        }
    }
}
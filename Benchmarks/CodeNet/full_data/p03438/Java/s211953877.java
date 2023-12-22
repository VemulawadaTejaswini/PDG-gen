import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            b[i] = sc.nextInt();
        }

        long remainA = 0;
        long remainB = 0;
        for (int i = 0 ; i < N; i++) {
            if (a[i] > b[i]) {
                long count = Math.min(remainB, a[i]-b[i]);
                remainA += a[i]-b[i]-count;
                remainB -= count;
            } else if (a[i] < b[i]) {
                long count = Math.min(remainA, (b[i]-a[i]+1)/2);
                remainA -= count;
                remainB += (b[i]-a[i]+1)/2-count;
                if (a[i] + (b[i]-a[i]+1)/2 * 2 - b[i] == 1) {
                    remainA++;
                }
            }
            //System.out.println("remainA: " + remainA + ", remainB: " + remainB);
        }

        //System.out.println("remainA: " + remainA + ", remainB: " + remainB);
        System.out.println(remainA-remainB == 0 || remainA-remainB == -1 ? "Yes" : "No");
    }
}


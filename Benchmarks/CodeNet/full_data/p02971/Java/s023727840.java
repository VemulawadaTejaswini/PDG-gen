import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i= 0;i < n;i++) {
            a[i] = sc.nextInt();
            b[i] = a[i];
        }

        Arrays.sort(b);
        int max1 = b[b.length - 1];
        int max2 = b[b.length - 2];
        for (int i = 0;i<n;i++) {
            if (a[i] == max1) {
                System.out.println(max2);
            } else {
                System.out.println(max1);
            }
        }

    }
}
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        long ap = 0;
        long bp = 0;
        for (int i = 0; i < n; i++) {
            if(b[i] < a[i]) bp += a[i] - b[i];
            if(a[i] < b[i]) ap += (b[i] - a[i]) /2;
        }
        System.out.println(bp <= ap ? "Yes" : "No");
        sc.close();
    }

}

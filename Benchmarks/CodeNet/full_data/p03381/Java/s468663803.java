import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+2];
        a[0] = 0;
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        a[n+1] = Integer.MAX_VALUE;
        
        int b[] = a.clone();
        Arrays.sort(a);
        
        int mid = a[n/2 + 1];
        for (int i = 1; i <= n; i++) {
            if (b[i] >= a[n/2 + 1]) {
                System.out.println(a[n/2] + " ");
                
            } else {
                System.out.println(a[n/2 + 1] + " ");
            }
        }
    }
}

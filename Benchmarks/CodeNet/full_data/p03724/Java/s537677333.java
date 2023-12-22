import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            a[x]++; a[y]++;
        }
        boolean ans = true;
        for (int i = 0; i < n; i++) {
            if(a[i] % 2 != 0){
                ans = false;
                break;
            }
        }
        System.out.println(ans ? "YES" : "NO");
        sc.close();

    }

}

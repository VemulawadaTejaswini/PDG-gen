import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[100001];
        int d = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if(0 < a[x])d++;
            a[x]++;
        }
        System.out.println(n - d -(d % 2));
        sc.close();

    }

}

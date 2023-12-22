import java.util.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] l = new int[n];
        for (int i=0; i < n; i++) {
            l[i] = sc.nextInt();
        }

        int current = 0;
        int ans = 1;
        for (int al : l) {
            current += al;
            if (current <= x) {
                ans++;
            } else {
                break;
            }
        }

        System.out.println(ans);
    }

}

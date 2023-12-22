import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] r = new int[9];
        for (int i = 0; i < n; ++i) {
            int a = sc.nextInt();
            if (a > 3199) {
                r[8]++;
            } else {
                r[a/400]++;
            }
        }
        
        int c = 0;
        for (int i = 0; i < 8; ++i) {
            if (r[i] > 0) {
                c++;
            }
        }

        System.out.println((c > 0 ? c : 1) + " " + (c + r[8]));
    }
}
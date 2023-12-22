import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        long na = 0;
        long nb = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int gap = sc.nextInt() - a[i];
            if (gap < 0) {
                nb += -gap;
            } else {
                na += gap / 2;
            }
        }

        System.out.println(na >= nb ? "Yes" : "No");
    }
}
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int position = 0;
        for (int i = 0; i < n; i++) {
            if (1 == sc.nextInt()) {
                position = i;
            }
        }
        int lCount = position;
        int rCount = n - position -1;

        int res = lCount / (k-1);
        if (lCount % (k-1) != 0) {
            res++;
        }
        res += rCount / (k-1);
        if (rCount % (k-1) != 0) {
            res++;
        }
        System.out.println(res);

    }

}
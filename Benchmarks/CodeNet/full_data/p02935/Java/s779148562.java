import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] ary = new int[n];

        for (int i = 0; i < n; i++) {
            ary[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(ary);
        double x = ary[0];
        for (int i = 1; i < n ; i++) {
            x = (x + ary[i]) / 2;
        }
        System.out.print(x);
    }
}
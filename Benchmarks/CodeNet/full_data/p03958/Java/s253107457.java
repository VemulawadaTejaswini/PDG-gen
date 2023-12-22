import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int t = sc.nextInt();
        int a[] = new int[t];
        for (int i = 0; i < t; i++)
            a[i] = sc.nextInt();

        Arrays.sort(a);
        System.out.println(Math.max(0, a[t - 1] - 1 - (k - a[t - 1])));
    }
}
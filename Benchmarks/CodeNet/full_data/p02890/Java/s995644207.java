import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int[] a = new int[n];
        Set<Integer> a = new HashSet<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        int sizeA = a.size();

        System.out.println(n);

        for (int i = 2; i <= n; i++) {
            System.out.println(sizeA / i);
        }

        sc.close();
    }

}

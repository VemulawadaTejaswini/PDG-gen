import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] copy = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            copy[i] = a[i];
        }
        Arrays.sort(copy);
        if (copy[n - 1] == copy[n - 2]) {
            for (int i = 0; i < a.length; i++)
                System.out.println(copy[n - 1]);
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == copy[n - 1])
                    System.out.println(copy[n - 2]);
                else
                    System.out.println(copy[n - 1]);
            }
        }
    }
}
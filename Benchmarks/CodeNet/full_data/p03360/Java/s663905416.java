import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Arrays.sort(a);
        for (int i = 0; i < k; i++) {
            a[2] *= 2;
        }
        System.out.println(a[0] + a[1] + a[2]);
        sc.close();
    }
}
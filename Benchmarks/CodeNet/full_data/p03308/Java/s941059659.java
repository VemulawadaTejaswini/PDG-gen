import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        System.out.println(a[a.length-1] - a[0]);
        sc.close();
    }
}

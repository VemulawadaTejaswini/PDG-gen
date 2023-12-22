import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a;
        int n;
        int sum = 0, count = 0;
        int aini = 7;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];

        a[0] = aini;

        for (int i = 1; i < a.length; i++) {
            a[i] = a[i-1] + 5;
            for (int j = 2; j < a[i]; j++) {
                if (a[i] % j == 0) {
                    a[i] += 5;
                    j--;
                }
            }
        }

        for (int x: a) {
            System.out.print(x + " ");
            sum += x;
        }
        //System.out.println(sum);

    }
}

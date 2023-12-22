import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static int max_array (int[] array) {
        int maximum = array[0];
        for (int i = 1; i < array.length; i++) {
            maximum = Math.max(maximum, array[i]);
        }

        return maximum;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hp = sc.nextInt();
        int[] a = new int[n];
        Integer[] b = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int a_max = max_array(a);
        Arrays.sort(b, Collections.reverseOrder());

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (b[i] < a_max) {
                break;
            }
            cnt++;
            hp -= b[i];
        }
        cnt += (hp + hp % a_max)/a_max;

        System.out.println(cnt);
    }
}
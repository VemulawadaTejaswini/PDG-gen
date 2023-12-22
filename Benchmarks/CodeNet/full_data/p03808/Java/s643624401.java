import java.util.Scanner;

/**
 * Created by wenjian on 2017/2/4.
 */
public class Main{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[] a = new int[n];
        for (int i=0; i<a.length; ++i) a[i] = reader.nextInt();

        int min = 0;
        for (int i=0; i<a.length; ++i) {
            if (a[min] > a[i]) min = i;
        }

        int sum = 0;
        while (sum < a.length) {
            ++sum;

            if (min == a.length) min = 0;
            if (a[min] < sum) {
                System.out.println("NO");
                return;
            }
            ++min;
        }
        System.out.println("YES");
    }
}

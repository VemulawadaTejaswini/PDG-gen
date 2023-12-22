import java.util.ArrayList;
import java.util.List;
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
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<a.length; ++i) {
            if (a[min] > a[i]) {
                min = i;
                list.clear();
                list.add(i);
            }
            else if (a[min] == a[i]) list.add(i);
        }


        for (Integer i : list) {
            boolean flag = false;
            int sum = 0;
            while (sum < a.length) {
                ++sum;

                if (i == a.length) i = 0;
                if (a[i] < sum) {
                    flag = true;
                    break;
                }
                ++i;
            }
            if (!flag) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Point> list = new ArrayList<>();
        int[] arr = new int[n];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1,b = sc.nextInt() - 1;
            arr[a]++;
            arr[b]--;
            list.add(new Point(a,b));
        }

        int ans = 0;
        while (true) {
            int now = 0;
            int max = 0;
            int maxIndex = 0;
            for (int i = 0; i < n; i++) {
                now += arr[i];
                if (now > max) {
                    max = now;
                    maxIndex = i;
                }
            }

            //System.out.println(Arrays.toString(arr)+" "+maxIndex);
            if (list.isEmpty()) {
                System.out.println(ans);
                return;
            }
            ans++;
            for (Iterator<Point> iterator = list.iterator();iterator.hasNext();) {
                Point p = iterator.next();
                if (p.x <= maxIndex && p.y > maxIndex) {
                    arr[p.x]--;
                    arr[p.y]++;
                    iterator.remove();
                }
            }
        }
    }
}

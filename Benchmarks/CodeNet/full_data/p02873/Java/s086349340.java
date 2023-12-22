
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int n = arr.length;

        long sum = 0;

        int current = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == '<') {
                current++;
                max = Math.max(max, current);
            } else {
                current = 0;
            }
            sum += current;
        }
//        debug(sum, max, current);

        current = 0;
        int min = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == '>') {
                current--;
                min = Math.min(min, current);
            } else {
                current = 0;
            }
            sum += Math.abs(current);
        }
//        debug(sum, min, current);

        List<Integer> list = new ArrayList<>();
        int c = 1;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) c++;
            else {
                list.add(c);
                c = 1;
            }
        }
        list.add(c);
        int n2 = list.size();

//        debug(list);

        if (arr[0] == '<') {
            for (int i = 0; i < n2 - 1; i = i + 2) {
                int x = Math.min(list.get(i), list.get(i + 1));
//            debug(sum, x);
                sum -= x;
            }
        } else {
            for (int i = 1; i < n2 - 1; i = i + 2) {
                int x = Math.min(list.get(i), list.get(i + 1));
//            debug(sum, x);
                sum -= x;
            }
        }


        System.out.println(sum);

    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }
        boolean b = true;
        while (b) {
            b = false;
            list.sort((val1, val2) -> val1 - val2);
            for (int i = 0; i < list.size() - 1; i++) {
                for (int r = list.size() - 1; r > i; r--) {
                    if (list.get(r) % list.get(i) == 0) {
                        list.remove(r);
                    }
                }
            }
            int min = list.get(0);
            for (int i = 0; i < list.size(); i++) {
                int val = list.get(i);
                while (val > min) {
                    val -= min;
                    b = true;
                }
                list.set(i, val);
            }
        }
        int min = Integer.MAX_VALUE;
        for (Integer i : list)
            if (i < min) min = i;
        System.out.println(min);
    }
}
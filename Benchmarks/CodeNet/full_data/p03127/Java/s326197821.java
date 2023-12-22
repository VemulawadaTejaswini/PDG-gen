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
            for (int i = list.size() - 1; i > 0; i--) {
                if (list.get(i).equals(list.get(i - 1))) {
                    list.remove(i);
                }
            }
            int min = list.get(0);
            for (int i = 0; i < list.size(); i++) {
                while (list.get(i) > min) {
                    list.set(i, list.get(i) - min);
                    b = true;
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for (Integer i : list)
            if (i < min) min = i;
        System.out.println(min);
    }
}
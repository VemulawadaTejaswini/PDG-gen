import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        List<Integer> list = new ArrayList();
        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }

        int result = 0;
        while(shouldContinue(list)) {
            List<Integer> newList = new ArrayList<>(list.size());
            for (int value : list) {
                newList.add(value / 2);
            }
            list = newList;
            result++;
        }

        System.out.println(result);
    }

    private static boolean shouldContinue(List<Integer> list) {
        boolean hasPositive = false;
        for (int value : list) {
            if (value % 2 != 0) {
                return false;
            }
            if (!hasPositive && value > 0) {
                hasPositive = true;
            }
        }
        return hasPositive;
    }
}
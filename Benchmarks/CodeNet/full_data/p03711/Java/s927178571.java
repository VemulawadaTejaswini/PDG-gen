import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] first = {1, 3, 5, 7, 8, 10, 12};
        Integer[] second = {4, 6, 9, 11};

        List<Integer> firstArrays = Arrays.asList(first);
        List<Integer> secondArrays = Arrays.asList(second);

        String result = "No";
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (firstArrays.contains(x) && firstArrays.contains(y)) {
            result = "Yes";
        } else if (secondArrays.contains(x) && secondArrays.contains(y)) {
            result = "Yes";
        }

        System.out.println(result);
    }
}
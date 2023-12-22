import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        int c = Integer.parseInt(scanner.next());
        scanner.close();

        Integer[] array = {a, b, c};

        Arrays.sort(array, Comparator.reverseOrder());

        boolean canShare = array[0] == (array[1] + array[2]);

        System.out.println(canShare ? "Yes" : "No");
    }
}

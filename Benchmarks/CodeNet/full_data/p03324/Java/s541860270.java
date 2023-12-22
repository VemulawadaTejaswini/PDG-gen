import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputD = Integer.parseInt(sc.next());
        int inputN = Integer.parseInt(sc.next());

        int[] arr = IntStream.range(1, 1000000)
                .filter(num -> calc(num,inputD)).toArray();
        System.out.println(arr[inputN -1]);
    }
    private static boolean calc(int x, int d) {
        int count = 0;
        int tmp = x;
        while (true) {
            if (tmp % 100 == 0) {
                count++;
                tmp = tmp/ 100;
            } else {
                break;
            }
        }
        if (count == d) {
            return true;
        } else {
            return false;
        }
    };
}

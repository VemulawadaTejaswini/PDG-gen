import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int[] arr;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        arr = Arrays.stream(input.split("")).mapToInt(Integer::parseInt).toArray();

        long sum = calc(0, arr.length - 1);
        System.out.println(sum);
    }

    private static long calc(int position, int end) {
        if (position > end) return 0;

        long tmp = 0;
        for (int i = position; i < end; i++) {
            tmp += toInt(position, i) * Math.pow(2, (end - i - 1)) + calc(i + 1, end);
        }
        tmp += toInt(position, end);
        return tmp;
    }

    private static long toInt(int start, int end) {
        if (start == end) {
//            System.out.println("start: " + start + " end: " + end + " -> " + arr[start]);
            return arr[start];
        }

        long tmp = 0;
        for (int i = start; i <= end; i++) {
            tmp += arr[i] * Math.pow(10, (end - i));
        }
//        System.out.println("start: " + start + " end: " + end + " -> " + tmp);
        return tmp;
    }
}
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        int N = Integer.parseInt(array[0]);
        int M = Integer.parseInt(array[1]);
        array = scanner.nextLine().split(" ");
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < N; ++i) {
            int a = Integer.parseInt(array[i]);
            int count = map.getOrDefault(a, 0);
            map.put(a, count + 1);
        }
        for (int i = 0; i < M; ++i) {
            array = scanner.nextLine().split(" ");
            int B = Integer.parseInt(array[0]);
            int C = Integer.parseInt(array[1]);
            int count = map.getOrDefault(C, 0);
            map.put(C, count + B);
        }
        Integer[] values = map.keySet().toArray(new Integer[0]);
        Arrays.sort(values, Collections.reverseOrder());

        long sum = 0;
        int remain = N;
        for (Integer value : values) {
            int count = map.get(value);

            if (count < remain) {
                sum += value.longValue() * count;
                remain -= count;
            } else {
                sum += value.longValue() * remain;
                System.out.println(sum);
                break;
            }
        }
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int input = scanner.nextInt();

        long[] arr = new long[number];
        for (int i = 0; i < number; i++) {
            arr[i] = scanner.nextInt();
        }

        List<Long> arr2 = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            for (int k = j + 1; k < arr.length; k++) {
                arr2.add(arr[j] * arr[k]);
            }
        }
        arr2.sort(Comparator.naturalOrder());
        System.out.println(arr2.get(input - 1));
    }
}

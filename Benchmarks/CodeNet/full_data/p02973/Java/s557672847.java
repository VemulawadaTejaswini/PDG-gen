
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long [] a = new long[n];
        for (int i = 0; i < n; ++i) {
            a[i] = scanner.nextLong();
        }
        List<List<Long>> numbers = new ArrayList<>();
        List<Long> first = new ArrayList<>();
        List<Long> last = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            int pos = Collections.binarySearch(
                    first, a[i]
            );
            if (pos >= 0 && pos < first.size()) {
                ArrayList<Long> currentList = new ArrayList<>();
                currentList.add(a[i]);
                numbers.add( currentList);
                first.add(a[i]);
                last.add(a[i]);
                continue;
            }
       //     System.out.println("current: " + a[i]);
            pos = -1 * (pos + 1);
            int former = pos - 1;
        //    System.out.println("pos: " + pos);
            if (pos == 0) {
                ArrayList<Long> currentList = new ArrayList<>();
                currentList.add(a[i]);
                numbers.add(0, currentList);
                first.add(0, a[i]);
                last.add(0, a[i]);
            } else {
                int value = Collections.binarySearch(
                        last.subList(0, pos),
                        a[i]
                );
                if (0 <= value && value < pos) {
                    ArrayList<Long> currentList = new ArrayList<>();
                    currentList.add(a[i]);
                    numbers.add(currentList);
                    first.add(a[i]);
                    last.add(a[i]);
                }
                value = -1 * (value + 1);
   //             System.out.println("value: " + value);
                if (value >= pos && last.get(former) >= a[i]) {
                    ArrayList<Long> currentList = new ArrayList<>();
                    currentList.add(a[i]);
                    numbers.add(currentList);
                    first.add(a[i]);
                    last.add(a[i]);
                } else {

                    numbers.get(pos - 1).add(a[i]);
                    first.set(pos - 1, a[i]);
                    last.set(pos - 1, a[i]);
                }
            }
//            numbers.forEach(
//                    nums -> {
//                        nums.forEach(
//                                num -> System.out.print(" " + num)
//                        );
//                        System.out.println();
//                    }
//            );
        }
        System.out.println(numbers.size());
    }
}

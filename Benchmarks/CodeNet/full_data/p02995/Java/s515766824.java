
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author yoshizaki
 *131
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        long min = scanner.nextLong();
        long max = scanner.nextLong();
        long divider1 = scanner.nextLong();
        long divider2 = scanner.nextLong();
        long min1 = 0l;
        if (min % divider1 == 0l) {
            min1 = min / divider1;
        } else {
            min1 = min/divider1 +1l;
        }
        long max1 =0l;
        if (max % divider1 == 0l) {
            max1 = max / divider1;
        } else {
            max1 = max/divider1 -1l;
        }
        long min2 = 0l;
        if (min % divider2 == 0l) {
            min2 = min / divider2;
        } else {
            min2 = min/divider2 +1l;
        }
        long max2 =0l;
        if (max % divider2 == 0l) {
            max2 = max / divider2;
        } else {
            max2 = max/divider2 -1l;
        }
        List<Long> divider = new ArrayList<Long>();
        for (long i = min1; i<=max1; i++) {
            divider.add(Long.valueOf(i * divider1));
        }
        for (long i = min2; i<=max2; i++) {
            divider.add(Long.valueOf(i * divider2));
        }
        long div = divider.stream().distinct().count();
        
        System.out.println(max - min - div);
    }
}
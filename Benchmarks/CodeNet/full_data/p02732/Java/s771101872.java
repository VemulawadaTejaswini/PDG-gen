import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Long> list = new ArrayList<>();
        HashMap<Long,Long> map = new HashMap<>();
        long n = scanner.nextLong();
        long c;
        for (long i = 0; i < n; i++) {
            c = scanner.nextLong();
            list.add(c);
            if (!map.containsKey(c)) {
                map.put(c,1L);
            } else {
                map.replace(c,map.get(c) + 1);
            }
        }
        long count = 0;
        for (Long aLong : list) {
            for (Map.Entry<Long, Long> entry : map.entrySet()) {
                Long aLong1 = entry.getKey();
                Long aLong2 = entry.getValue();
                if (aLong.equals(aLong1)) {
                    count += ((aLong2 - 1) * (aLong2 - 2) / 2);
                } else {
                    count += aLong2 * (aLong2-1) / 2;
                }
            }
            System.out.println(count);
            count = 0;
        }
    }

}
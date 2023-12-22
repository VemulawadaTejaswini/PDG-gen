import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long m = scanner.nextLong();
        scanner.nextLine();
        String[] frig = scanner.nextLine().split(" ");
        String[] oven = scanner.nextLine().split(" ");
        HashMap<String,Long> waribiki = new HashMap<>();
        String t1,t2;
        long w;
        for (int i = 0; i < m; i++) {
            t1 = scanner.next();
            t2 = scanner.next();
            w = scanner.nextLong();
            waribiki.put(t1 + t2,w);
        }
        long cheap = 0x7fffffffffffffffL;
        String key;
        long curVal;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                key = "" + i + j;
                curVal = Long.parseLong(frig[i-1]) +
                        Long.parseLong(oven[j-1]);
                if (waribiki.containsKey(key)) {
                    curVal -= waribiki.get(key);
                }
                if (cheap > curVal) {
                    cheap = curVal;
                }
            }
        }
        System.out.println(cheap);
    }
}
import java.util.*;

public class Main {

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] chs = sc.next().toCharArray();
        long n = chs.length;

        Map<Character, Long> countMap = new HashMap<>();

        for(char ch: chs) {
            if(!countMap.containsKey(ch)) {
                countMap.put(ch, 1L);
            } else {
                countMap.computeIfPresent(ch, (c, l) -> l + 1);
            }
        }

        long count = n * (n - 1) / 2 + 1;
        for(char ch: countMap.keySet()) {
            long m = countMap.get(ch);
            count -= m * (m - 1) / 2;
        }

        System.out.println(count);
    }
}
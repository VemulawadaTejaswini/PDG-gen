import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong(), M = scanner.nextLong();
        Map<Long, Long> drinks = new TreeMap<>();
        for(int i = 0; i < N; i++){
            Long key = scanner.nextLong();
            Long value = scanner.nextLong();
            drinks.computeIfPresent(key,(k, v) -> v + value);
            drinks.computeIfAbsent(key,(k) -> value);
        }
        drinks.entrySet().stream().sorted((m1, m2) -> {
            return m1.getKey().compareTo(m2.getKey());
        });
        long ans = 0;
        drinks.forEach((k, v) -> System.out.println(k));
        for(Long k : drinks.keySet()){
            long buy = Long.min(drinks.get(k), M);
            ans += (buy * k);
            M -= buy;
            if(M == 0)
                break;
        }
        System.out.println(ans);
    }
}
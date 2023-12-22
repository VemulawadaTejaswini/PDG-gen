import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        HashMap<Long, Long> map = new HashMap<>();
        HashSet<Long> keys = new HashSet<>();
        for(int i = 0; i < n; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            map.put(a, map.getOrDefault(a, 0L) + b);
            keys.add(a);
        }
        Long[] array = new Long[keys.size()];
        keys.toArray(array);
        Arrays.sort(array);
        for(int i = 0; i < keys.size(); i++) {
            long key = array[i];
            long num = map.get(key);
            k -= num;
            if(k <= 0) {
                System.out.println(key);
                break;
            }
        }
    }
}


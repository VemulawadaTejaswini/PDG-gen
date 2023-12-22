import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int sum = 0;
        int[] bigarray = new int[k];
        int a, b;
        Map<Integer,Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            if (map.containsKey(a)){
                b += map.get(a);
                map.put(a,b);
            }else {
                map.put(a,b);
            }
        }
        for (int key:map.keySet()) {
            sum += map.get(key);
            if (sum >= k){
                System.out.println(key);
                break;
            }
        }
    }
}

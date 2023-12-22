import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Long, Integer> map = new HashMap<>();
        map.put(0L, 1);
        long sum = 0;
        for(int i=0 ; i<n; i++) {
            sum += sc.nextInt();
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        long res = 0;

        for(Map.Entry<Long, Integer> entry : map.entrySet()) {
            long key = entry.getKey();
            int v = entry.getValue();
            if(v > 1) {
                res += (long) v * (v-1) / 2;
            }
        }

        System.out.println(res);
    }

}

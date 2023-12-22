

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Map<Integer, Integer> tm = new TreeMap<>();
        for(int i = 0; i < N; i++) {
            int key = sc.nextInt();
            int val = sc.nextInt();
            tm.put(key,val);
        }
        int res = 0;
        int count = 0;
        for(Map.Entry<Integer, Integer> entry : tm.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();
            count += val;
            res += key * val;
            if(count == M) {
                res = key * val;
                break;
            }
            if(count > M) {
                res = res - (key * (count - M));
                break;
            }
        }
        System.out.println(res);
    }
}

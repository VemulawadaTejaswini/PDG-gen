import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();

        Map<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            map.put(sc.nextInt(), sc.nextInt());
        }

        long res = 0;

        for(Map.Entry<Integer, Integer> entry: map.entrySet() ) {
            Integer a = entry.getKey();
            Integer b = entry.getValue();

            if ( b > M ) {
                res += (long)a * M;
                break;
            } else {
                res += (long)a * b;
                M -= b;
            }
        }

        System.out.println(res);

    }
}

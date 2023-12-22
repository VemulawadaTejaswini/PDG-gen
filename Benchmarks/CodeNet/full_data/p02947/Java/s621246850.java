
import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
//        long a = calcNumOfCombination(99999999, 2);
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        char[] s = new char[10];
        Map<String, Long> hoge = new HashMap<>();
        for (int i = 0; i < N; i++) {
            scanner.next().getChars(0, 10, s, 0);
            Arrays.sort(s);
            String fuga = String.valueOf(s);
            if (hoge.containsKey(fuga)) {
                hoge.put(fuga, hoge.get(fuga) + 1);
            } else {
                hoge.put(fuga, 1L);
            }

        }
        long count = 0;
        for (String key : hoge.keySet()) {
            Long p = hoge.get(key);
            if (p >= 2) {
                long tmp = calcNumOfCombination(p, 2);
                count += tmp;
            }
        }

        System.out.println(count);
    }

    long calcNumOfCombination(long n, long r){
        long num = 1;
        for(long i = 1; i <= r; i++){
            num = num * (n - i + 1) / i;
        }
        return num;
    }
}

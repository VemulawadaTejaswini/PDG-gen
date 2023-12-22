import java.util.*;

public class Main {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        List<Integer> aList = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            aList.add(scanner.nextInt());
        }
        scanner.close();
        long count = 0;
        long calcValue = 1000000007;

        Map<Integer, Long> map = new HashMap<>();
        map.put(0, 1L);
        for (int i = 0; i < N; i++) {
            if (aList.contains(i)) {
                continue;
            }

            long valueCount = map.get(i);
            // 1段上がる場合
            int one = i + 1;
            if (one <= N) {
                if (one == N) {
                    count += valueCount;
                } else if (!aList.contains(one)) {
                    if (map.containsKey(one)) {
                        long oneCount = map.get(one);
                        oneCount += (valueCount);
                        map.put(one, oneCount);
                    } else {
                        map.put(one, valueCount);
                    }
                }
            }
            // 2段上がる場合
            int two = i + 2;
            if (two <= N) {
                if (two == N) {
                    count += valueCount;
                } else if (!aList.contains(two)) {
                    if (map.containsKey(two)) {
                        long twoCount = map.get(two);
                        twoCount += (valueCount);
                        map.put(two, twoCount);
                    } else {
                        map.put(two, valueCount);
                    }
                }
            }
            count = count % calcValue;
        }

        System.out.println(count);
    }
}

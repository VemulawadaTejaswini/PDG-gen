import java.util.*;

public class Main {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<long[]> xyList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            long[] xy = new long[2];
            xy[0] = scanner.nextLong();
            xy[1] = scanner.nextLong();
            xyList.add(xy);
        }
        scanner.close();

        int cost = 0;

        // xでソート
        Collections.sort(xyList, (o1, o2) -> {
            Long x1 = o1[0];
            Long x2 = o2[0];
            return x1.compareTo(x2);
        });

        long tmpX = 0;
        long tmpY = 0;
        boolean first = true;
        Map<Map<Long, Long>, Integer> countPQ = new HashMap<>();
        for (long[] entry : xyList) {
            if (first) {
                first = false;
                tmpX = entry[0];
                tmpY = entry[1];
                continue;
            }
            long calcX = entry[0] - tmpX;
            long calcY = entry[1] - tmpY;
//            System.out.println("tmpX:" + calcX + " / tmpY:" + calcY);
            Map<Long, Long> tmpMap = new HashMap<>();
            tmpMap.put(calcX, calcY);
            if (countPQ.containsKey(tmpMap)) {
                int costTmp = countPQ.get(tmpMap);
                costTmp++;
                countPQ.put(tmpMap, costTmp);
            } else {
                countPQ.put(tmpMap, 1);
            }
            tmpX = entry[0];
            tmpY = entry[1];
        }

//        countPQ.entrySet().stream().forEach(mapIntegerEntry -> {
//            System.out.println(mapIntegerEntry.getKey() + "/" + mapIntegerEntry.getValue());
//        });

        // countチェック
        int max = 0;
        for (Map.Entry<Map<Long, Long>, Integer> entry : countPQ.entrySet()) {
            max = Math.max(max, entry.getValue());
            cost += entry.getValue();
        }

        // cost calc
        cost = cost - max + 1;

        System.out.println(cost);
    }
}

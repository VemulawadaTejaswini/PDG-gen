import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Long> voteMap = new HashMap<>();
        long N = Long.parseLong(sc.nextLine());
        long maxCount = 0L;
        for (long i = 0; i < N; i++) {
            String voteName = sc.nextLine();
            Long count = voteMap.get(voteName);
            if (Objects.isNull(count)) {
                voteMap.put(voteName, 1L);
            } else {
                long newCount = count + 1;
                if (newCount > maxCount) {
                    maxCount = newCount;
                }
                voteMap.put(voteName, newCount);
            }
        }
        sc.close();
        List<String> maxNames = new ArrayList<>();
        for (String name : voteMap.keySet()) {
            long count = voteMap.get(name);
            if (count == maxCount || maxCount == 0) {
                maxNames.add(name);
            }
        }
        Collections.sort(maxNames);
        for (String name : maxNames) {
            System.out.println(name);
        }
    }

}

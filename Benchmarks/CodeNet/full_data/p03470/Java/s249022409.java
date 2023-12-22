import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mochiCount = sc.nextInt();
        Map<Integer, Integer> mochiMap = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < mochiCount; i++) {
            int mochi = sc.nextInt();
            if (mochiMap.containsKey(mochi)) {
                mochiMap.put(mochi, (mochiMap.get(mochi) + 1));
            } else {
                mochiMap.put(mochi, 1);
            }
        }
        
        int result = 0;
        for(Integer mochiKey : mochiMap.keySet()) {
            result++;
        }
        System.out.println(result);
    }
}

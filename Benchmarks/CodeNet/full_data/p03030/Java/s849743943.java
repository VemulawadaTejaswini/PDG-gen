import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Map<String, Map<Integer, Integer>> gidebook = new TreeMap<>();

        for (int i = 1; i <= num; i++) {
            String inCity = sc.next();
            if (!gidebook.containsKey(inCity)) {
                gidebook.put(inCity, new TreeMap<Integer, Integer>(Comparator.reverseOrder()));
            }
            gidebook.get(inCity).put(sc.nextInt(), i);
        }

        for (String city : gidebook.keySet()) {
            for (Integer score : gidebook.get(city).values()) {
                System.out.println(score);
            }
        }

    }
}

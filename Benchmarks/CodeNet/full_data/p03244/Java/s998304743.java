import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map odds = new TreeMap<Integer, Integer>();
        Map evens = new TreeMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            if (i % 2 == 0) {
                odds.put(tmp, (Integer) odds.getOrDefault(tmp, 0) + 1);
            } else {
                evens.put(tmp, (Integer) evens.getOrDefault(tmp, 0) + 1);
            }
        }

        List<Entry<Integer, Integer>> oddsEList = new ArrayList<Entry<Integer, Integer>>(odds.entrySet());
        Collections.sort(oddsEList, new Comparator<Entry<Integer, Integer>>() {
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });

        List<Entry<Integer, Integer>> evensEList = new ArrayList<Entry<Integer, Integer>>(evens.entrySet());
        Collections.sort(evensEList, new Comparator<Entry<Integer, Integer>>() {
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });

        if (!oddsEList.get(0).getKey().equals(evensEList.get(0).getKey())) {
            System.out.println(n - oddsEList.get(0).getValue() - evensEList.get(0).getValue());
        } else {
            if (oddsEList.size() == 1 && evensEList.size() == 1) {
                System.out.println(n / 2);
            } else if (oddsEList.size() == 1) {
                System.out.println(n - oddsEList.get(0).getValue() - evensEList.get(1).getValue());
            } else if (evensEList.size() == 1) {
                System.out.println(n - oddsEList.get(1).getValue() - evensEList.get(0).getValue());
            } else {
                if (oddsEList.get(0).getValue() + evensEList.get(1).getValue() > oddsEList.get(1).getValue()
                        + evensEList.get(0).getValue()) {
                    System.out.println(n - oddsEList.get(0).getValue() - evensEList.get(1).getValue());
                } else {
                    System.out.println(n - oddsEList.get(1).getValue() - evensEList.get(0).getValue());
                }
            }
        }
    }
}
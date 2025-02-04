import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        java.util.Map<Integer, Integer> oddMap = new HashMap<>();
        java.util.Map<Integer, Integer> evenMap = new HashMap<>();

        int currentKey = 0;
        for (int i = 0; i < n; i++) {
            currentKey = sc.nextInt();
            if (i % 2 == 0) {
                oddMap.put(currentKey, oddMap.getOrDefault(currentKey, 0) + 1);
            } else {
                evenMap.put(currentKey, evenMap.getOrDefault(currentKey, 0) + 1);
            }
        }

        int o1_k = 0;
        int e1_k = 0;
        int o2 = 0;
        int e2 = 0;

        int o1 = 0;
        int e1 = 0;

        for (java.util.Map.Entry<Integer, Integer> entry : oddMap.entrySet()) {
            if (entry.getValue() > o1) {
                o2 = o1;
                o1_k = entry.getKey();
                o1 = entry.getValue();
            } else if (entry.getValue() > o2){
                o2 = entry.getValue();
            }
        }

        for (java.util.Map.Entry<Integer, Integer> entry : evenMap.entrySet()) {
            if (entry.getValue() > e1) {
                e2 = e1;
                e1_k = entry.getKey();
                e1 = entry.getValue();
            } else if (entry.getValue() > e2){
                e2 = entry.getValue();
            }
        }

        if (o1_k == e1_k) {
            System.out.println(Math.min(n - o2 - e1, n - o1 - e2));
        } else {
            System.out.println(n - o1 - e1);
        }


    }
}
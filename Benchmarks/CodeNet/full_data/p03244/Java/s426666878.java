import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<Integer, Integer> oddMap = new HashMap<>();
        Map<Integer, Integer> evenMap = new HashMap<>();
        int currentVal = 0;
        for (int i = 0; i < n; i++) {
            currentVal = sc.nextInt();
            if (i % 2 == 0) {
                oddMap.put(currentVal, oddMap.getOrDefault(currentVal, 0) + 1);
            } else {
                evenMap.put(currentVal, evenMap.getOrDefault(currentVal, 0) + 1);
            }
        }

        int oddTargetVal = 0;
        int evenTargetVal = 0;

        int oddTargetCount = 0;
        int evenTargetCount = 0;
        for (Entry<Integer, Integer> entry : oddMap.entrySet()) {
            if (entry.getValue() > oddTargetVal) {
                oddTargetVal = entry.getKey();
                oddTargetCount = entry.getValue();
            }
        }

        for (Entry<Integer, Integer> entry : evenMap.entrySet()) {
            if (entry.getValue() > evenTargetVal) {
                evenTargetVal = entry.getKey();
                evenTargetCount = entry.getValue();
            }
        }

        if (oddTargetVal == evenTargetVal) {
            System.out.println(n / 2);
            return;
        }

        System.out.println(n - (oddTargetCount + evenTargetCount));


    }
}
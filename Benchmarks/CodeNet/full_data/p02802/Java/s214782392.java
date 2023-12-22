import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        Set<Integer> acList = new HashSet<>();
        Map<Integer, Integer> waMap = new HashMap<>();
        for (int i = 0; i < m; i++){
            int q = sc.nextInt();
            String r = sc.next();
            if(!acList.contains(q)) {
                if (r.equals("AC")) {
                    acList.add(q);
                } else {
                    waMap.put(q, waMap.getOrDefault(q, 0) + 1);
                }
            }
            sc.nextLine();
        }
        System.out.println(acList.size() + " " + acList.stream().mapToInt(q -> waMap.getOrDefault(1, 0)).sum());
    }
}

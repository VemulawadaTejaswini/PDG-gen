import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k  = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int count = map.getOrDefault(a,0);
            map.put(a, ++count);
        }

        if (map.size() <= k) {
            System.out.println(0);
        }

        int diff = map.size() - k ;
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((e1, e2) -> (e1.getValue() - e2.getValue()));
        int count = 0;
        for (int i = 0; i < diff; i++) {
            count += list.get(i).getValue();
        }

        System.out.println(count);
    }
}
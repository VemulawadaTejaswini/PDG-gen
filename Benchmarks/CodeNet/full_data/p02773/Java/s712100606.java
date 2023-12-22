import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a = new String[n];
        for (int i = 0;i<n;i++) {
            a[i] = sc.next();
        }
        int max = 0;
        Map<String, Integer> map = new HashMap<>();
        for (String s : a) {
            int count = map.getOrDefault(s, 0);
            ++count;
            map.put(s,count);
            max = Math.max(max, count);
        }
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (max == e.getValue()) System.out.println(e.getKey());
        }
    }
}

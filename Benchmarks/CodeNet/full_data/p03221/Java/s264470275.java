import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] p = new int[m];
        long[] y = new long[m];
        Map<Long, Integer> ymap = new HashMap<>();
        Map<Long, Integer> map = new HashMap<>();
        for(int i=0; i<m; i++) {
            p[i] = Integer.parseInt(sc.next());
            y[i] = Long.parseLong(sc.next());
            ymap.put(y[i], p[i]);
            map.put(y[i], i);
        }
        Arrays.sort(y);
        
        StringBuilder sb = new StringBuilder();
        Map<Integer, String> ans = new HashMap<>(); 
        Map<Integer, Integer> pmap = new HashMap<>();
        for(long key : y) {
            int pre = ymap.get(key);
            if(pmap.containsKey(pre)) {
                pmap.put(pre, pmap.get(pre)+1);
            }else {
                pmap.put(pre, 1);
            }
            sb = new StringBuilder();
            sb.append(String.format("%06d", pre));
            sb.append(String.format("%06d", pmap.get(pre)));
            ans.put(map.get(key), String.valueOf(sb));
        }
        
        for(int i=0; i<m; i++) {
            System.out.println(ans.get(i));
        }
    }
}

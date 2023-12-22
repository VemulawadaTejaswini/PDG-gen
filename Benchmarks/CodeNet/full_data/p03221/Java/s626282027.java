import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        Map<String,Integer> map = new TreeMap<>();
        for (int i = 0; i < m; i++) {
            int p = scan.nextInt();
            long y = scan.nextLong();
            map.put(y+"_"+i, p);
        }
        int[] n_cnt = new int[n];
        String[] ans = new String[m];
        for(Entry<String, Integer> entry : map.entrySet()){
            int p = map.get(entry.getKey());
            n_cnt[p-1]++;
            String[] s = entry.getKey().split("_");
            String x = String.valueOf(p).format("%5s", p).replace(" ", "0");
            String y = String.valueOf(n_cnt[p-1]).format("%5s", n_cnt[p-1]).replace(" ", "0");
            ans[Integer.parseInt(s[1])] = (x + y);
        }
        for (int i = 0; i < m; i++) {
            System.out.println(ans[i]);
        }
    }
}

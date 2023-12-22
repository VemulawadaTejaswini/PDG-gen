import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextInt();
        Map<Long,Long> map = new HashMap<>();
        long ans  = 0;

        for(int i = 0;i < n;i++){
            long cost = sc.nextLong();
            long num = sc.nextLong();
            map.put(cost,num);
        }

        Object[] o = map.keySet().toArray();
        Arrays.sort(o);
        List<Long> key = new ArrayList<>(map.keySet());
        List<Long> val = new ArrayList<>(map.values());

        for(int i = 0;i < n && m > 0;i++){
            ans += key.get(i) * Math.min(val.get(i),m);
            m -= Math.min(val.get(i),m);
        }

        System.out.println(ans);
    }
}
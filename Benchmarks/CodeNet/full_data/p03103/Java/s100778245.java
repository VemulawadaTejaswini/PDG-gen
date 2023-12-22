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
        List<Long> key = new ArrayList<>(map.keySet());//値段
        List<Long> val = new ArrayList<>(map.values());//数

        for(int i = 0;i < n && m > 0;i++){
            long l = (long)Math.min(val.get(i),m);
            ans += key.get(i) * l;
            m -= l;
        }
        System.out.println(ans);
    }
}

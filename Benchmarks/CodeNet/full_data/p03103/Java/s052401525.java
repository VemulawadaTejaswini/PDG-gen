import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
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
        long count = 0;
        for(int i = 0;i < key.size();i++){
            count += val.get(i);
            ans += val.get(i) * key.get(i);
            if(count >= m){
                long over = count - m;
                ans -= key.get(i) * over;
                break;
            }
        }
        System.out.println(ans);
    }
}
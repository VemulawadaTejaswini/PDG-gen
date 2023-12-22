import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        long ans = 0;
        for(int i = 0;i < n;i++){
            int cost = sc.nextInt();
            int kazu = sc.nextInt();
            map.put(cost,kazu);
        }
        Object[] o = map.keySet().toArray();
        Arrays.sort(o);
        List<Integer> key = new ArrayList<>(map.keySet());
        List<Integer> val = new ArrayList<>(map.values());
        int count = 0;
        for(int i = 0;i < key.size();i++){
            count += val.get(i);
            ans += key.get(i) * val.get(i);
            if(count > m){
                int over = count - m;
                ans -= over * key.get(i);
                break;
            }
        }

        System.out.println(ans);
    }
}
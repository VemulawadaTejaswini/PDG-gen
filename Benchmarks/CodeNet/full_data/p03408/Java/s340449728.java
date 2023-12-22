import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            String tmp = sc.next();
            if(map.containsKey(tmp)){
                map.put(tmp, map.get(tmp) + 1);
            }else{
                map.put(tmp, 1);
            }
        }
        int M = sc.nextInt();
        for(int i = 0; i < M; i++){
            String tmp = sc.next();
            if(map.containsKey(tmp)){
                map.put(tmp, map.get(tmp) - 1);
            }
        }
        int ans = 0;
        for(Integer num : map.values()){
            ans = Math.max(ans, num);
        }
        System.out.println(ans);
    }
}
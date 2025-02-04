import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Map<Integer,Long> map = new HashMap<>();
        for(int i = 0;i < n;i++){
            int a = sc.nextInt();
            long b = sc.nextLong();
            if(map.containsKey(a)){
                map.put(a,map.get(a)+b);
                continue;
            }
            map.put(a,b);
        }
        //System.out.println(k);
        //System.out.println(list);
        long m = 0;
        for(Integer key : map.keySet()){
            m += map.get(key);
            if(m >= k){
                System.out.println(key);
                return;
            }
        }
    }
}

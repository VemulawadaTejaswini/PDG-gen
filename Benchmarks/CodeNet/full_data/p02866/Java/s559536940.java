import java.util.*;
import java.util.Map;
import java.util.HashMap;

public class Main{
    static long fix = 998244353L;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long ans = 1;

//        long fix = 998244353;

        int n = sc.nextInt();

        int[] d = new int[n];

        int cnt = 0;
        for (int i=0; i<n; i++){
            int t  = sc.nextInt();
            d[i] = t;
            if (t==0) cnt++;
        }
        if (cnt!=1){
            System.out.println(0);
            return;
        }

//        Arrays.sort(d);

        if (d[0]!=0){
            System.out.println(0);
            return;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i=1; i<n; i++){
            if(map.containsKey(d[i])){
                int v = map.get(d[i]);
                ++v;
                map.put(d[i], v);
            }else {
                map.put(d[i], 1);
            }
        }

        Object[] mapkey = map.keySet().toArray();
        Arrays.sort(mapkey);

//        if(map.get(0)!=1){
//            System.out.println(0);
//            return;
//        }
//        System.out.println(map);

        List<Integer> l = new ArrayList<>();

        for (Integer val: map.values()){
            l.add(val);
        }
//        System.out.println(l);

//        int tmp = -1;
//        for (Integer val: map.keySet()){
//            if (val!=tmp+1){
//                System.out.println(0);
//                return;
//            }else {
//                tmp++;
//            }
//        }
        List<Integer> list = new ArrayList<>();
        for (Integer val: map.keySet()){
            list.add(val);
        }
        for (int i=0; i<list.size()-1; i++){
            if (list.get(i+1)!=list.get(i)+1){
                System.out.println(0);
                return;
            }
        }

        for (int i=0; i<l.size()-1; i++){
            ans *= (((power((long)l.get(i), (long)l.get(i+1)))%fix));
            ans %= fix;
        }
        System.out.println(ans);
    }

    public static long power(long x, long n){
        long sum = 1;
        while (n>0){
            if ((n&1)==1){
                sum *= x;
                sum %= fix;
            }
            x *= x;
            x %= fix;
            n>>=1;
        }
        return sum%fix;
    }

}
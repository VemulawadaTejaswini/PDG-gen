import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();

        for(int i = 0; i<n/2; i++) {
            int odd = sc.nextInt();
            int even = sc.nextInt();
            if(map1.containsKey(odd) ==  false) map1.put(odd, 1);
            else map1.put(odd, map1.get(odd)+1);

            if(map2.containsKey(even) ==  false) map2.put(even, 1);
            else map2.put(even, map2.get(even)+1);
        }

        int v1 = 0;
        int v2 = 0;
        int a1 = 0;
        int a2 = 0;
        int b1 = 0;
        int b2 = 0;

        for(Integer key: map1.keySet()) {
            int now = map1.get(key);
            if(now>=v1) {
                a2 = a1;
                a1 = key;
                v1 = now;
            }else if(now>=map1.get(a2)){
                a2 = key;
            }
        }

        for(Integer key: map2.keySet()) {
            int now = map2.get(key);
            if(now>=v2) {
                b2 = b1;
                b1 = key;
                v2 = now;
            }else if(now>=map2.get(b2)){
                b2 = key;
            }
        }

        if(a1!=b1) {
//            System.out.println(a1+" " +b1);
//            System.out.println(a2+" " +b2);
            int cnt = 0;
           for(Integer key : map1.keySet()) {
               if (map1.size()==1) break;
               if (key!=a1) cnt += map1.get(key);
           }
            //System.out.println(cnt);

            for(Integer key : map2.keySet()) {
                if (map2.size()==1) break;
                if (key!=b1) cnt += map2.get(key);
            }
            System.out.println(cnt);
            return;
        }

        if(a1==b1) {
//            System.out.println(a1+" " +b1);
//            System.out.println(a2+" " +b2);
            if(a2==0 && b2 == 0) {
                System.out.println(n/2);
                return;
            }
            int cnt = 0;
            int cnt2 = 0;
            for(Integer key : map1.keySet()) {
                if (key!=a1) cnt += map1.get(key);
                if (key!=a2 && a2!=0) cnt2 += map1.get(key);
            }
            for(Integer key : map2.keySet()) {
                if (key!=b2 && b2!=0) cnt += map2.get(key);
                if (key!=b1) cnt2 += map2.get(key);
            }
            System.out.println(Math.min(cnt,cnt2));
            return;
        }

    }
}

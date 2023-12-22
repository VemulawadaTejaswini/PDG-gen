import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] a = new int[n];
        Map<Integer, Integer> acount = new TreeMap<>();
        int[] b = new int[m];
        int[] c = new int[m];
        Map<Integer,Integer> map = new TreeMap<>(Comparator.reverseOrder());
        long sum = 0;
        //aを格納
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(sc.next());
            sum += a[i];
            if(acount.containsKey(a[i])) {
                acount.put(a[i], acount.get(a[i])+1);
            }else {
                acount.put(a[i], 1);
            }
        }
        //Arrays.sort(a);
        //key=c[i] value=b[i]の合計としてTreeMap
        for(int i=0; i<m; i++) {
            b[i] = Integer.parseInt(sc.next());
            c[i] = Integer.parseInt(sc.next());
            if(map.containsKey(c[i])) map.put(c[i], map.get(c[i])+b[i]);
            else map.put(c[i], b[i]);
        }
        
        for(int key : map.keySet()) {
            int count = map.get(key);
            for(int akey : acount.keySet()) {
                if(akey < key) {
                    while(count > 0) {
                        if(count >= acount.get(akey)) {
                            //count操作
                            count -= akey * acount.get(akey);
                            count += key * acount.get(akey);
                            //sum操作
                            sum -= (long)akey * acount.get(akey);
                            //加算
                            if(acount.containsKey(key)) acount.put(key, acount.get(key)+acount.get(akey));
                            else acount.put(key, acount.get(akey));
                            //削除
                            acount.remove(akey);
                            //sum操作
                            sum += (long)key * acount.get(akey);
                        }else {
                            //sum操作
                            sum -= (long)akey * count;
                            //sum操作
                            sum += (long)key * count;
                            //減算
                            acount.put(akey, acount.get(akey)-count);
                            //加算
                            if(acount.containsKey(key)) acount.put(key, acount.get(key)+count);
                            else acount.put(key, count);
                            //count操作
                            count = 0;
                        }
                    }
                }else {
                    break;
                }
            }
        }

        System.out.println(sum);
    }
}
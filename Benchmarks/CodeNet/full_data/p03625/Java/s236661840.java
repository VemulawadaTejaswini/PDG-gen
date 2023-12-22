import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        
        Integer[] a = new Integer[N];
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<N; i++) {
            a[i] = Integer.parseInt(sc.next());
            if(map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i])+1);
            }else {
                map.put(a[i], 1);
            }
        }
        
        Object[] mapkey = map.keySet().toArray();
        Arrays.sort(mapkey, Collections.reverseOrder());
        long hen1 = 0;
        long hen2 = 0;
        for(Object ob : mapkey) {
            int x = Integer.parseInt(String.valueOf(ob)); 
            if(map.get(x) >= 4) {
                if(hen1 == 0) {
                    hen1 = x;
                    hen2 = x;
                }else {
                    hen2 = x;
                }
                break;
            }else if(map.get(x) >= 2) {
                if(hen1 == 0) {
                    hen1 = x;
                }else {
                    hen2 = x;
                    break;
                }
            }
        }
        
        System.out.println(hen1*hen2);
    }
}

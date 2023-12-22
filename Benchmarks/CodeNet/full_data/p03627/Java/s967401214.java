import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        TreeMap<Long,Integer> map = new TreeMap<Long,Integer>(Comparator.reverseOrder());
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            long a = sc.nextLong();
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }else{
                map.put(a,1);
            }
        }
        long ans = 0;
        boolean get2 = false;
        boolean get4 = false;
        for(Map.Entry<Long,Integer> e : map.entrySet()){
            long k = e.getKey();
            int v = e.getValue();
            if(v == 1) continue;
            else if(v >= 2 && get2){
                ans *= k;
                get4 = true;
                break;
            }else if(v >= 4){
                ans = k*k;
                get4 = true;
                break;
            }else{
                ans = k;
                get2 = true;
            }
        }
        System.out.print(get4 ? ans : 0);
    }
}
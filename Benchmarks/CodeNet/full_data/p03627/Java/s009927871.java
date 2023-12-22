import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>(Comparator.reverseOrder());
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }else{
                map.put(a,1);
            }
        }
        int ans = 0;
        boolean get2 = false;
        boolean get4 = false;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            int k = e.getKey();
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
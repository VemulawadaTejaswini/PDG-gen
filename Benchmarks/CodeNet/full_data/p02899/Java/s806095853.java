import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 1; i <= n; i++){
            map.put(sc.nextInt(),i);
        }
        Object[] mapkey = map.keySet().toArray();
        Arrays.sort(mapkey);
        
        for (int k : map.keySet()){
            System.out.print(map.get(k) + " ");
        }
    }
}

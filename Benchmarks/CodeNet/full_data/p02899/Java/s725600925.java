import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Map<Integer, Integer> mMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < N; i++) {
            mMap.put( sc.nextInt(), i + 1);
        }

        // キーでソートする
        Object[] mapkey = mMap.keySet().toArray();
        Arrays.sort(mapkey);
        
        for (Integer nKey : mMap.keySet())
        {
            System.out.println(mMap.get(nKey));
        }
    }
}
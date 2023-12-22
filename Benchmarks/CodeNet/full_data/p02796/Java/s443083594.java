import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<Integer,Integer> tree = new TreeMap<>();
        for (int i=0;i<n;i++){
            tree.put(sc.nextInt(),sc.nextInt());
        }
        int ans = 0;
        Map.Entry<Integer,Integer> pre = tree.pollFirstEntry();
        for (int i=1;i<n;i++){
            int PRE = pre.getKey()+pre.getValue()-1;
            int NOW = tree.firstKey()-tree.firstEntry().getValue()+1;
            if (PRE>=NOW){
                ans++;
                tree.pollFirstEntry();
            }else {
                pre = tree.pollFirstEntry();
            }
        }
        System.out.println(n-ans);
    }
}

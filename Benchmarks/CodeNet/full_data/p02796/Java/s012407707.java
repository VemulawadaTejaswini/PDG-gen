import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<Integer,Integer> tree = new TreeMap<>();
        for (int i=0;i<n;i++){
            int x = sc.nextInt();
            int l = sc.nextInt();
            tree.put(x+l,x-l);
        }
        int cur = Integer.MIN_VALUE;
        int ans = 0;
        for (int i=0;i<n;i++){
            if (cur<=tree.firstEntry().getValue()){
                ans++;
                cur = tree.pollFirstEntry().getKey();
            }
        }
        System.out.println(ans);
    }
}

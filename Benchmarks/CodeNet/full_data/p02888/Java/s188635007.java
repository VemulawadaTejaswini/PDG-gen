import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ll = new ArrayList<>();
        for(int i = 0; i < n; i++){
            ll.add(sc.nextInt());
        }
        Collections.sort(ll);
        long ans = 0;
        for(int i = n-1; i >= 0; i--){
            int big = ll.get(i);
            for(int j = i-1; j >= 0; j--){
                int small = ll.get(j);
                int res = Collections.binarySearch(ll, big-small+1);
                //System.out.println(i + " " + j + " " + (big-small+1) + " " + res);
                res = res >= 0 ? res : ~res;
                ans += res < j ? j-res : 0;
            }
        }
        System.out.println(ans);
    }
}

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
                int res = beamSearch(ll,big-small+1);
                //System.out.println(i + " " + j + " " + (j > res ? j-res : 0));
                ans += (j > res) ? j-res : 0;
            }
        }
        System.out.println(ans);
    }
    
    public static int beamSearch(ArrayList<Integer> ll, int k){
        int left = 0;
        int right = ll.size();
        while(right - left > 1){
            int mid = (right + left) / 2;
            if(ll.get(mid) > k){
                right = mid;
            }else{
                left = mid;
            }
        }
        return left;
    }
}

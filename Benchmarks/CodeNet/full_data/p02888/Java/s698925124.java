import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ll = new int[n];
        for(int i = 0; i < n; i++){
            ll[i] = sc.nextInt();
        }
        Arrays.sort(ll);
        long ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int tmp = beamSearch(ll,ll[i] + ll[j]);
                ans += (long)Math.max(0,tmp-j);
            }
        }
        System.out.println(ans);
    }
    
    public static int beamSearch(int[] ll, int k){
        int left = -1;
        int right = ll.length;
        while(right - left > 1){
            int mid = (right + left) / 2;
            if(ll[mid] >= k){
                right = mid;
            }else{
                left = mid;
            }
        }
        return left;
    }
}

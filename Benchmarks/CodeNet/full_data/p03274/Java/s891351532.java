import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        right.add(0);
        left.add(0);        
        for(int i = 0; i < N; i++){
            int x = sc.nextInt();
            if( x > 0 ){
                right.add(x);
            } else if( x < 0){
                left.add(x);
            } else if( x == 0){
                K--;
            }
        }
        
        if( K == 0 ){
            System.out.println(0);
            return;
        }
        
        Collections.sort(right);
        Collections.sort(left, Collections.reverseOrder());
        
        long ans = Long.MAX_VALUE;
        int leftMax = Math.min(left.size(), K);
        for(int i = leftMax-1; i >=0; i--){
            long lv = Math.abs(left.get(i));
            int ri = K - i;
            if( ri < 0 || ri >= right.size()) continue;
            long rv = right.get(ri);
            
            long min = Math.min(lv*2+rv, rv*2 +lv);
            ans = Math.min(ans, min);
        }
        
        System.out.println(ans);
    }
}

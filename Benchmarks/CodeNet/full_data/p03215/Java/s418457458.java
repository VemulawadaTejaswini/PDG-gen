import java.util.*;

public class Main{
    static ArrayList<Long> arr;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            long tmp = 0;
            for(int j=i; j<n; j++){
                tmp += a[j];
                arr.add(tmp);
            }
        }
        
        arr.sort(Comparator.reverseOrder());
        
        
        /*//---------------
        for(int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
        
        System.out.println("------------");
        *///----------
        
        long ans = 0L;
        for(int b = 60; b>=0; b--){
            long bit = 1L<<b;
            int cnt = 0;
            for(int i=0; i<arr.size(); i++){
                //System.out.println(arr.get(i));
                long tmp = arr.get(i);
                if((tmp&bit) > 0 && tmp >= ans){
                    cnt++;
                }
            }
            if(cnt >= k){
                ans += bit;
            }
            //System.out.println("b:" + b + " cnt:" + cnt);
            //System.out.println("nowans : " + ans);
        }
        
        System.out.println(ans);
    }
}
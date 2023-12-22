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
            long tmp = 0L;
            for(int j=i; j<n; j++){
                tmp += a[j];
                arr.add(tmp);
            }
        }
        
        long ans = 0L;
        for(int b = 63; b>=0; b--){
            int cnt = 0;
            for(int i=0; i<arr.size(); i++){
                long tmp = arr.get(i);
                if((tmp|(ans+(1L<<b))) == tmp){
                    cnt++;
                }
            }
            if(cnt >= k){
                ans |= 1L<<b;
            }
        }
        
        System.out.println(ans);
    }
}
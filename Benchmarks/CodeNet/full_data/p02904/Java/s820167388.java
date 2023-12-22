import java.util.*;
public class Main{
    
    static final int INF = (int)1e9;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        int[] b = new int[n];
        for(int i=0; i<n-1; i++){
            b[i] = (a[i]<a[i+1])? 1 : 0;
        }
        for(int i=0; i<n-1; i++){
            b[i+1] += b[i];
        }
        
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0; i<k; i++){
            set.add(a[i]);
        }
        
        boolean ct = (b[k-1]==k-1);
        int ans = (ct)? 0 : 1;
        
        for(int i=k; i<n; i++){
            boolean flag1 = (set.first()==a[i-k]);
            set.add(a[i]);
            set.remove(a[i-k]);
            boolean flag2 = (set.last()==a[i]);
            boolean ok = !(flag1&&flag2);
            
            if(b[i] - b[i-k+1] == k-1){
                ct = true;
            }else if(ok){
                ans++;
            }
        }
        
        if(ct){
            ans++;
        }
        System.out.println(ans);
    }
    
}
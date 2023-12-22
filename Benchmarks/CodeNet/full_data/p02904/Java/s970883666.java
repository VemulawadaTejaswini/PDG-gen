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
        
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0; i<k; i++){
            set.add(a[i]);
        }
        
        int dub;
        if(set.first()==a[0] && set.last()==a[k-1]){
            dub = 1;
        }else{
            dub = 0;
        }
        
        int ans = 1;
        for(int i=k; i<n; i++){
            set.add(a[i]);
            boolean f = false;
            if(!(set.first()==a[i-k] && set.last()==a[i])){
                ans++;
                f = true;
            }
            
            set.remove(a[i-k]);
            
            if(set.first()==a[i-k+1] && set.last()==a[i]){
                dub++;
                if(f) ans--;
            }
        }
        
        if(dub > 1){
            ans++;
        }
        System.out.println(ans);
    }
    
}
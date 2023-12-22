import java.util.*;
public class Main{
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
            b[i+1] = (a[i]<a[i+1])? 1 : 0;
            b[i+1] += b[i];
        }
        
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0; i<k; i++){
            set.add(a[i]);
        }
        
        int ct = (b[k-1]==k-1)? 1 : 0;
        int ans = ct^1;
        for(int i=k; i<n; i++){
            set.add(a[i]);
            boolean ok = (set.first()!=a[i-k]) || (set.last()!=a[i]);
            set.remove(a[i-k]);
            
            if(b[i] - b[i-k+1] == k-1){
                ct = 1;
            }else if(ok){
                ans++;
            }
        }
        
        System.out.println(ans+ct);
    }
    
}
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] p = new int[n];
        for(int i=0; i<n; i++){
            p[i] = Integer.parseInt(sc.next());
        }
        
        long ans = 1;
        TreeSet<Integer> a = new TreeSet<>();
        for(int i=0; i<k-1; i++){
            a.add(p[i]);
        }
        
        for(int i=0; i<n-k; i++){
            int first = p[i];
            int last = p[i+k-1];
            a.add(last);
            if(!isAMax(a,last) || !isAMin(a,first)){
                ans++;
            }
            a.remove(p[i]);
        }
        
        System.out.println(Math.max(Math.min(ans, n-k),1));
    }
    
    
    public static boolean isAMax(TreeSet<Integer> a, int x){
        int higher = a.last();
        return higher==x;
    }
    
    public static boolean isAMin(TreeSet<Integer> a, int x){
        int lower = a.first();
        return lower==x;
    }
    
}
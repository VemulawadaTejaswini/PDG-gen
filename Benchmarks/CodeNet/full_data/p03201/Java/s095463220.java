import java.util.*;

public class Main{
    
    static int[] v,d,c,result,used;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        Map<Integer,Integer> map = new TreeMap<>();
        
        ArrayList<Integer> nibeki = new ArrayList<>();
        for(long i=2; i<2_000_000_000; i*=2){
            nibeki.add((int)i);
        }
        
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(a);
        int ans = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<nibeki.size(); j++){
                if(map.get(nibeki.get(j)-a[i])!=null
                    && map.get(nibeki.get(j)-a[i])>=1){
                    map.merge(a[i], -1, Integer::sum);
                    ans++;
                }
            }
            map.merge(a[i], 1, Integer::sum);
        }
        System.out.println(ans);
    }
}

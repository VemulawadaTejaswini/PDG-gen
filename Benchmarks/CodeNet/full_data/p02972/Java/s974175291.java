import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n+1];
        
        for(int i=1; i<=n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int[] b = new int[n+1];
        
        for(int i=n; i>=1; i--){
            int t = 0;
            for(int j=i; j<=n; j+=i){
                t += b[j];
            }
            if(t%2!=a[i]){
                ans.add(i);
                b[i]++;
            }
        }
        
        System.out.println(ans.size());
        for(int i=0; i<ans.size(); i++){
            System.out.println(ans.get(i));
        }
    }
}

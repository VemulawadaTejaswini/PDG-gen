import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int mod = (int)1e9+7;
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] a = new int[n+1];
        int[] b = new int[m+1];
        
        long ans = 1;
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        for(int i=0; i<m; i++){
            b[i] = Integer.parseInt(sc.next());
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        int aidx = 0;
        int bidx = 0;
        
        for(int i=n*m; i>=1; i--){
            int at = a[n-aidx];
            int bt = b[m-bidx];
            
            long tmp = 1;
            
            if(at>i) tmp = 0;
            if(bt>i) tmp = 0;
            
            if(at==i && bt==i){
                //tmp = 1;
                aidx++;
                bidx++;
            }else if(at==i){
                tmp = bidx;
                aidx++;
            }else if(bt==i){
                tmp = aidx;
                bidx++;
            }else{
                tmp = aidx*bidx - (n*m-i);
                if(tmp<0) tmp = 0;
            }
            
            ans = ans*tmp%mod;
        }
        
        System.out.println(ans);
    }
}

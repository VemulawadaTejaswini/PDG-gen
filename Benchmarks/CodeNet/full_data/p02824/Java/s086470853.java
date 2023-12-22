import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        long m = Long.parseLong(sc.next());
        int v = Integer.parseInt(sc.next());
        int p = Integer.parseInt(sc.next());
        
        long[] a = new long[n];
        for(int i=0; i<n; i++){
            a[i] = Long.parseLong(sc.next());
        }
        
        Arrays.sort(a);
        
        long lb = 0;
        long ub = n;
        for(int i=0; i<66; i++){
            long[] b = new long[n];
            for(int j=0; j<n; j++){
                b[j] = a[j];
            }
            long[] c = new long[n];
            
            long z = v*m;
            long mid = (lb+ub)/2;
            long sh = mid+m;
            
            for(int j=0; j<n; j++){
                long minus = Math.min(sh-a[j], m);
                minus = Math.max(minus, 0);
                z -= minus;
                b[j] += minus;
                c[j] = m-minus;
            }
            
            long cnt = 0;
            Arrays.sort(b);
            for(int j=n-1; j>=0; j--){
                b[j] += c[j];
                z -= c[j];
                if(z<=0){
                    break;
                }
                if(b[j]>sh){
                    cnt++;
                }
                if(cnt==p-1){
                    break;
                }
            }
            //System.out.println("mid=" + mid);
            //System.out.println("sh=" + sh);
            if(z>0){
                lb = mid;
            }else{
                ub = mid;
            }
        }
        
        int cnt = 0;
        for(int j=0; j<n; j++){
            if(lb+1<=a[j])cnt++;
        }
        System.out.println(cnt);
    }
}

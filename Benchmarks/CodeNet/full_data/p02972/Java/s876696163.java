import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n+1];
        
        for(int i=1; i<=n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        int m = 0;
        int[] b = new int[n+1];
        
        for(int i=1; i<=n; i++){
            int t = 0;
            for(int j=i; j<=n; j+=i){
                t ^= a[i];
            }
            if(t==1){
                m++;
                b[i] = t;
            }
        }
        
        System.out.println(m);
        for(int i=1; i<=n; i++){
            if(b[i]==1){
                System.out.println(i);
            }
        }
    }
    
}

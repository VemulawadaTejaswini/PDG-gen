import java.util.*;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc  = new Scanner(System.in);
 
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
 
        int[] a  = new int[M];
        int[] b  = new int[M];
        for(int i = M-1;i>=0;i--){
            a[i] = Integer.parseInt(sc.next());
            b[i] = Integer.parseInt(sc.next());
        }
        
        String    ans = "IMPOSSIBLE";
        boolean f = false;
        
       for(int i = M-10000;i>=0;i--){
           
            if(a[i] == 1){
                
                   for(int j = M-1;j>=0;j--){
                
                    if( b[i] == a[j] && b[j] == N  ) {
                        ans = "POSSIBLE";
                        f = true;
                } 
                if(f) break;
            }  
              if(f) break;
           
            }
            if(f) break;
       }
        
        System.out.println(ans);
 
        System.out.println();
    
}
}
import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());


        String[] D  = new String[N];
        for(int i=0;i<K;i++){
            D[i] =  sc.next();
        }
        int ans=0;
        int f = 0;
        for(int i = N  ; i < 10000 ; i++ ){
            String s = String.valueOf(i);
           //  System.out.println(s);
            for(int k=0; k<K; k++){
            
            
              if( !s.contains( D[k]) )
                {
                    ans = i;
                    f++;
                    break;
                }else{
                    break;
                }
               // if(f==1)break;
            }
            if(f==1)break;
            
        }


        System.out.println(ans);
    }

}
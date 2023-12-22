
import java.util.Scanner;

/**
 *  http://abc047.contest.atcoder.jp/tasks/abc047_b
 * @author おとうさん
 */
public class Main {
    public static void main(String[] args) {
        int W, H, N ;
        Scanner sc = new Scanner(System.in);
        W = sc.nextInt();
        H = sc.nextInt();
        N = sc.nextInt();
        int x[]=new int[N] ;
        int y[]=new int[N] ;
        int a[]=new int[N] ;
        for (int i=0 ; i<N; i++){
            x[i]=sc.nextInt() ;
            y[i]=sc.nextInt() ;
            a[i]=sc.nextInt() ;            
        }
        int x_low, x_high, y_low, y_high ;
        x_high = W ;
        y_high = H ;
        x_low = 0 ;
        y_low = 0 ;
        for (int i=0 ; i<N ;i++) {
            switch (a[i]) {
                case 1 :
                    x_low = x[i] ;
                    break ;
                case 2 :
                    x_high = x[i] ;
                    break ;
                case 3 :
                    y_low = y[i] ;
                    break ;
                case 4 :
                    y_high = y[i] ;
                    break ;
            }
        }
        int ans ;
        ans = (x_high - x_low) * (y_high - y_low) ;
        if (ans<0) ans = 0 ;
        System.out.println(ans) ;      

    }
    
}

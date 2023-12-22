import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        
        int total = 0;
        if( A + B > C * 2 ) {
            int Z = Math.min( X, Y );
            X -= Z;
            Y -= Z;
            total += Z * 2 * C;
        }
        
        if( X > 0 ) {
            int AA = Math.min( A, 2*C );
            total += AA * X;
        }
        
        if( Y > 0 ) {
            int BB = Math.min( B, 2*C );
            total += BB * Y;
        }
        System.out.println(total);
    }
}

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main( String[] args ){

        Scanner in = new Scanner(System.in);

        String[] params = in.nextLine().split(" ");
        int n = Integer.parseInt(params[0]);
        int m = Integer.parseInt(params[1]);

        int[] as = new int[m];
        int broken = -1;
        boolean end = false;
        for( int i = 0 ; i < m ; i++ ){
            as[i] = Integer.parseInt(in.nextLine());
            if( broken == -1 )broken = as[i];
            else if( broken + 1 == as[i] ){
                end = true;
            }
            else {
                broken = as[i];
            }
        }

        if( end ){
            System.out.println(0);
            return;
        }

        int pattern = 1;
        for( int step = 0 , aCount = 0 ; step < n ; ){
            if( aCount < m && step + 1 == as[aCount] ){
                step += 2;
                aCount++;
            }
            else if( aCount < m && step + 2 == as[aCount] ){
                step += 3;
                aCount++;
            }
            else if( step + 1 == n ) {
                step ++;
            }
            else {
                pattern *= 2;
                step += 2;
            }
        }

        System.out.println( pattern % 1000000007);

    }
}
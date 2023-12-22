import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int getFactorial( int x ){
        int ans = 1;
        for( int i = 1 ; i <= x ; i++ ){
            ans *= i;
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt( in.nextLine() );
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();

        for( int i = 0 ; i < n ; i++ ){
            String[] params = in.nextLine().split(" ");
            x.add( Integer.parseInt( params[0]));
            y.add( Integer.parseInt( params[1]));
        }

        double ans = 0.0;

        for( int i = 0 ; i < n - 1 ; i++ ){
            for( int j = i + 1 ; j < n ; j++ ){
                int xi = x.get( i );
                int yi = y.get( i );
                int xj = x.get( j );
                int yj = y.get( j );
                int calc = (xi - xj )*(xi - xj) + (yi - yj ) * ( yi - yj );
                double distance = Math.sqrt( calc < 0 ? calc * -1 : calc );
                ans += distance * 2 * getFactorial(n-1);
            }
        }

        System.out.println( ans / getFactorial( n ) );

    }

}

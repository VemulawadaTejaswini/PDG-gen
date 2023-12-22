import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt( in.nextLine() );
        String[] params = in.nextLine().split(" ");
        long[] hs = new long[n];
        for( int i = 0 ; i < n ; i++ ){
            hs[i] = Long.parseLong( params[i]);
        }

        int max = 0;
        int count = 0;
        for( int i = 0 ; i < n - 1 ; i++ ){
            if( hs[i] >= hs[ i+ 1 ] ){
                count++;
            }
            else {
                if( max < count ){
                    max = count;
                }
                count = 0;
            }
            if( i + 1 == n - 1 ){
                if( max < count ){
                    max = count;
                }
            }
        }

        System.out.println(max);

    }

}


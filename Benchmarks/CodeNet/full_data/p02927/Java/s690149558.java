import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] params = in.nextLine().split(" ");
        int M = Integer.parseInt(params[0]);
        int D = Integer.parseInt(params[1]);
        int count = 0;

        for( int m = 1 ; m <= M ; m++ ){
            for( int d = 1 ; d <= D ; d++ ){
                int d10 = d/10;
                int d1 = d%10;
                if( d1 >= 2 && d10 >= 2 ){
                    if( m == d1 * d10 ){
                        count++;
                    }
                }
            }
        }

        System.out.println( count );

    }

}

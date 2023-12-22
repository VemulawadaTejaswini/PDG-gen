import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] params = in.nextLine().split(" ");
        long n = Long.parseLong( params[0]);
        int a = Integer.parseInt( params[1]);
        int b = Integer.parseInt( params[2]);

        if( ( b - a ) % 2 != 0 ){
            System.out.println( b > a ? b - 1 : a - 1 );
            return;
        }

        System.out.println( b > a ? ( b - a ) / 2 : ( a - b ) / 2 );

    }

}

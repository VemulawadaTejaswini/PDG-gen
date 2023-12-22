import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] params = sc.nextLine().split(" ");
        long h = Long.parseLong( params[0] );
        int n = Integer.parseInt( params[1] );

        params = sc.nextLine().split(" ");
        int[] as = new int[n];
        long total = 0;
        for( int i = 0 ; i < n ; i++ ){
            as[i] = Integer.parseInt( params[i] );
            total += as[i];
        }

        System.out.println( h > total ? "No" : "Yes" );

    }

}

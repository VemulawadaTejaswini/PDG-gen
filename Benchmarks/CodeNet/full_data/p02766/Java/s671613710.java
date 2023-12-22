import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] params = sc.nextLine().split(" " );
        long n = Long.parseLong( params[0] );
        int k = Integer.parseInt( params[1] );
        int k2 = k;
        int count = 0;
        while( n > k2 ){
            k2 *= k;
            count++;
        }

        System.out.println( count + 1 );

    }

}

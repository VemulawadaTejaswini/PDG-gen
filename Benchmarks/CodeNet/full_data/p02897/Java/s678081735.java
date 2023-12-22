import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        if( n == 1 ){
            System.out.println(1);
            return;
        }

        if( n % 2 == 0 ){
            System.out.println( 0.5 );
        }
        else {
            int oddCount = n/2+1;
            System.out.println( (double)oddCount/n );
        }

    }
}

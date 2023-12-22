import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] params = in.nextLine().split(" ");
        int a = Integer.parseInt( params[1]);
        int b = Integer.parseInt( params[2]);

        if( ( b - a ) % 2 != 0 ){
            int count = a - 1;
            b -= count;
            count++;
            b--;
            count += ( b - 1 ) / 2;

            System.out.println( count );
        }
        else {
            System.out.println( ( b - a ) / 2 );
        }

    }

}


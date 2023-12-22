import java.util.Scanner;

/**
 * A - +-x
 * 整数 A, Bがあります。
 * A+B,  A−B,  A×B の中で最大の数を出力してください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        int a = sc.nextInt();
        int b = sc.nextInt();

        int addition = ( a + b );
        int subtraction = ( a - b );
        int multiplication = ( a * b );

        if( subtraction > addition ) {
            System.out.println( subtraction );
        }
        else  if( multiplication > addition ) {
            System.out.println( multiplication );
        }
        else {
            System.out.println( addition );
        }
    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] params = sc.nextLine().split(" ");
        long n = Long.parseLong(params[0]);
        long a = Long.parseLong( params[1]);
        long b = Long.parseLong( params[2]);

        long ab = n / ( a + b );
        long amari = n % ( a + b );

        System.out.println( a * ab + ( amari > a ? a : amari ) );

    }

}


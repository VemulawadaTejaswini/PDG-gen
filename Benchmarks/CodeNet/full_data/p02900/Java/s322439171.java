import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] params = in.nextLine().split(" ");
        long a = Long.parseLong( params[0]);
        long b = Long.parseLong( params[1]);

        long count = a < b ? a : b;
        int ans = 0;
        for( long i = count ; 0 < i ; i-- ){
            // 公約数か確認
            if( a % i == 0 && b % i == 0 ){
                boolean isPrime = true;
                for( long j = 2 ; j < i ; j++ ){
                    if( i % j == 0 ){
                        isPrime = false;
                        break;
                    }
                }
                if( isPrime ){
                    ans++;
                }

            }
        }
        System.out.println( ans );

    }

}

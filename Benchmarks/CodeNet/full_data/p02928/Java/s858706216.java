import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] params = in.nextLine().split(" ");
        int N = Integer.parseInt(params[0]);
        long K = Long.parseLong(params[1]);
        params = in.nextLine().split(" ");

        int[] As = new int[N];
        for( int i = 0 ; i < N ; i++ ){
            As[i] = Integer.parseInt(params[i]);
        }

        long inCount = 0;
        long outCount = 0;
        for( int i = 0 ; i < N ; i++ ){
            for( int j = 0 ; j < N ; j++ ){
                if( i == j ){
                    continue;
                }
                if( As[i] > As[j] ){
                    outCount++;
                    if( i < j ){
                        inCount++;
                    }
                }
            }
        }
        inCount *= K;
        while( inCount / 1000000007 > 0 ){
            inCount -= 1000000007;
        }
        outCount *= K;
        while( outCount / 1000000007 > 0 ){
            outCount -= 1000000007;
        }
        outCount *= K-1;
        while( outCount / 1000000007 > 0 ){
            outCount -= 1000000007;
        }
        outCount /= 2;

        System.out.println( ( inCount + outCount ) %1000000007);

    }

}

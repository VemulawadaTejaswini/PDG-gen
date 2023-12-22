import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int getGreatestCommonDivisor( int[] as , int n) {
        Arrays.sort(as);
        int ans = 1;
        for (int i = 2; i < as[n - 1]; i++) {

            boolean isOk = true;
            for (int j = 0; j < n; j++) {
                if (as[j] % i != 0) {
                    isOk = false;
                    break;
                }
            }

            if (isOk) {
                ans *= i;
                for (int j = 0; j < n; j++) {
                    as[j] /= i;
                }
            }

        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] params = in.nextLine().split(" ");

        int[] as = new int[n];
        for( int i = 0 ; i < n ; i++ ){
            as[i] = Integer.parseInt(params[i]);
        }

        int greatestCommonDivisor = getGreatestCommonDivisor( as , n );
        long child = greatestCommonDivisor;
        for( int i = 0 ; i < n ; i++ ) {
            child *= as[i];
        }

        long parent = 0;
        for( int i = 0 ; i < n ; i++ ){
            parent += child / as[i] / greatestCommonDivisor;
        }

        for( long i = 2 ; i < child ; i++ ){
            while(true){
                if( child % i == 0 && parent % i == 0 ){
                    child /= i;
                    parent /= i;
                }
                else {
                    break;
                }
            }
        }

        System.out.println( (double)child/parent );

    }

}

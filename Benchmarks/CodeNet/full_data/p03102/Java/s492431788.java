import java.util.Scanner;
import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                int num1 = scan.nextInt();
                int num2 = scan.nextInt();
                int num3 = scan.nextInt();
                
                int[] barray = new int[num2];
                int[] aarray = new int[num2];
                int sum = 0;
                int result = 0;

                for (int i=0; i<num1+1; i++) {
                    sum = 0;
                    for ( int j=0; j<num2; j++ ) {
                        if ( i == 0 ) {
                            barray[j] = scan.nextInt();
                        }
                        else {
                            aarray[j] = scan.nextInt();
                            sum += barray[j] * aarray[j];
                        }
                    }
                        if ( sum + num3 > 0 ) {
                            result += 1;
                        }
                }

                System.out.println( result );
                scan.close();
        }
}
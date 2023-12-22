import java.util.*;

public class Main {


    static int[] arr;

    static long N;
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        long k = s.nextLong();



        if (k < 2) {

            if (k == 0) {
                System.out.println(4);

                System.out.println("3 3 3");
            } else {

                System.out.println(3);

                System.out.println("1 0 3");
            }
        } else if ( k <= 50){


            for (long i = 0; i < k; i++) {

                System.out.println(k);

                System.out.print(k + " ");
            }
        } else {

            System.out.println(50);

            long l = k / 50;

            long left = k%50;

            long a = (l+1)*50 -(k-l) + 50;

            long b = l*50 -(k-l) + 49;

            for (int i = 0; i < left; i++) {

                System.out.print(a + " ");
            }

            for (int i = 0; i < 50-left; i++) {

                System.out.print(b +" ");
            }
        }


    }





}
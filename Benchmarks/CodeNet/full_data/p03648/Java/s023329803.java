import java.util.*;

public class Main {


    static int[] arr;

    static long N;
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int k = s.nextInt();

        System.out.println(k);

        if (k < 2) {

            if (k == 0) {
                System.out.println(4);

                System.out.println(3 + " " + 3 + " " + 3 + " " + 3);
            } else {

                System.out.println(3);

                System.out.println("1 0 3");
            }
        } else {
            for (int i = 0; i < k; i++) {

                System.out.print(k + " ");
            }
        }


    }





}
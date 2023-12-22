import java.util.*;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {

    static int N;
    static long A;
    static long B;
    static long C;
    static long[] map;





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        A = scanner.nextInt();
        B = scanner.nextInt();

        int temp = 0;
        for (int i = 1; i < 1000; i++) {
            temp += i;
            if(A < temp){
                System.out.println(temp - A);

                break;
            }

        }


    }



}


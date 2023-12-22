import java.util.*;

/**
 * Created by Santa.
 */
public class Main {

    static long N;
    static int M;
    static int A;
    static long B;
    static long C;
    static int[][] map;
    static int min = 9999999;
    static int[] moto = new int[3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        moto[0] = scanner.nextInt();
        moto[1] = scanner.nextInt();
        moto[2] = scanner.nextInt();

        Arrays.sort(moto);

        System.out.println((moto[1] - moto[0]) + (moto[2] - moto[1]));



    }




}


import java.util.*;

/**
 * Created by Seiya on 2016/10/16.
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int a = N * 800;
        int b = N / 15;

        System.out.println(a - b * 200);

    } // mainMethod



} // MainClass

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] d =  new int[3];

        d[0] = sc.nextInt();
        d[1] = sc.nextInt();
        d[2] = sc.nextInt();

        Arrays.sort(d);



        System.out.println(10 * d[2] + d[1] + d[0]);
    }

}

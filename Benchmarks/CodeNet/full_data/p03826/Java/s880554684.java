import java.util.Scanner;

/**
 * Created by User on 2017/02/07.
 */
public class Main {
    public static void main(String[] args) {
        int[] num = new int[4];
        Scanner scn = new Scanner(System.in);

        num[0] = scn.nextInt();
        num[1] = scn.nextInt();
        num[2] = scn.nextInt();
        num[3] = scn.nextInt();

        System.out.println(num[0] * num[1] > num[2] * num[3] ? num[0] * num[1] : num[2] * num[3]);
    }

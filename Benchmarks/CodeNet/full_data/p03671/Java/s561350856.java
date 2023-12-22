import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int count=0;
    private static ArrayList<Integer> now=new ArrayList<Integer>();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] b = new int[3];
        b[0] = sc.nextInt();
        b[1] = sc.nextInt();
        b[2] = sc.nextInt();

        Arrays.sort(b);

        System.out.println(b[0] + b[1]);


    }
}
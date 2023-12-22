import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        int[] a = new int[6];
        for (int i=0; i < 6; i++)
            a[i] = sc.nextInt();

        System.out.println(a[5] >= a[4] - a[0] ? "Yay!" : ":(");

    }

}

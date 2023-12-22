import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);

        double l = sc.nextInt();

        double v = l / 3;

        System.out.println(v * v * v);
    }
}
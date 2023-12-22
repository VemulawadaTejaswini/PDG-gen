import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int perTime = (100 * (n - m)) + (1900 * m);
        int times = (int) Math.pow(2, m);
        System.out.println(perTime * times);
    }
}

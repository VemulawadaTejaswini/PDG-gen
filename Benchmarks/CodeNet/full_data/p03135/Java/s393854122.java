import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double t = sc.nextDouble();
        double x = sc.nextDouble();

        sc.close();

        //        long ans = 0;

        System.out.println(t / x);
    }
}

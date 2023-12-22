import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n, c, b, a, mal=0,sum=0;
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        if (a >= c) {
            sum = a - c;
            mal=b;
        } else if (a <= c) {
            sum = c - a;
            mal = b - sum;
            if (b <= sum) {
                mal = 0;
            }
            if (a <= c) {
                sum = 0;
            }
        }
        System.out.println(sum+" "+mal);
    }

}
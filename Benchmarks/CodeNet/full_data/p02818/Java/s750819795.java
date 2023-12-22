import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, c, b, a, mal=0, need, sum=0;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int p = stdIn.nextInt();
        int q = stdIn.nextInt();
        int r = stdIn.nextInt();

        int max = p;
        if (max < q)
            max = q;
        if (max < r)
            max = r;
        System.out.println(p + q + r - max);
    }
}
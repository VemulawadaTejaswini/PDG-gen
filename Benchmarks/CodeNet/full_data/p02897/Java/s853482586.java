import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x = n / 2;
        x += n % 2 == 0 ? 0 : 1;

        Double result = (double)x / n;

        System.out.println(result);
    }
}

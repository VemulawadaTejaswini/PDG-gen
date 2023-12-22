import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long k = Long.parseLong(sc.next());

        long resultA = a - k;
        long resultB = b;
        if (resultA < 0) {
            resultB = b + resultA;
            resultA = 0;
        }

        System.out.println(resultA + " " + resultB);

        sc.close();
    }
}

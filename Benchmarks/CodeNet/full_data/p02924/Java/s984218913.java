import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();

        long result = n * (n - 1) / 2;

        System.out.println(result);
    }
}
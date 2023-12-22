import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long L = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long M = sc.nextLong();
        String target = "0";
        for (long i = 0; i < L; i++) {
            target = target + (A + B * i);
        }
        long result = Long.parseLong(target);
        System.out.println(result % M);
    }

}

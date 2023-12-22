import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long L;
        try (Scanner sc = new Scanner(System.in)) {
            L = sc.nextLong();
        }
        double c = (double) L / 3;
        double M = c * c * c;
        System.out.println(String.format("%.8f",M));
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = Double.parseDouble(sc.next());
        double B = Double.parseDouble(sc.next());

        System.out.println((int) Math.ceil(B / A));
    }
}
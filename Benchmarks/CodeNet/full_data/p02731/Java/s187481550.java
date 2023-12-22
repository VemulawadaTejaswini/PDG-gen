import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        scanner.close();

        double side = L / 3.0;

        System.out.println(Math.pow(side, 3));
    }
}

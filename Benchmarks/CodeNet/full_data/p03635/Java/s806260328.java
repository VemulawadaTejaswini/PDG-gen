import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        System.out.println((scanner.nextInt() - 1) * (scanner.nextInt() - 1));
    }
}

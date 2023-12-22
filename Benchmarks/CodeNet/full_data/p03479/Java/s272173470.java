import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long X = Long.parseLong(scanner.next());
        long Y = Long.parseLong(scanner.next());
        scanner.close();

        long num = X;

        int count = 0;
        do {
            count++;
            num = num * 2;
        } while (num <= Y);

        System.out.println(count);
    }

}

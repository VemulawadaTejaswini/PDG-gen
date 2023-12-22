import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = Integer.parseInt(scanner.next());
        int B = Integer.parseInt(scanner.next());
        scanner.close();
        int count = 0;
        for (int a = 1; a <= A; a++) {
            if (a <= B) {
                count++;
            }
        }

        System.out.println(count);
    }
}

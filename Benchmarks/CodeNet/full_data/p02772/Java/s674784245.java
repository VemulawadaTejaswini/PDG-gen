import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDocuments = scanner.nextInt();

        String answer = "APPROVED";
        for (int i = 0; i < numberOfDocuments; i++) {
            int nextInput = scanner.nextInt();
            if (nextInput % 2 == 0) {
                if (nextInput % 3 != 0 && nextInput % 5 != 0) {
                    answer = "DENIED";
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
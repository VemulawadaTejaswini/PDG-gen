import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
        int seikai = scanner.nextInt();

        if (testcase==seikai){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}

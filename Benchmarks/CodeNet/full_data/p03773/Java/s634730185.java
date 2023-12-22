import java.util.Scanner;

public class RemainingTime {

    private Scanner scanner = new Scanner(System.in);

    private void main() {
        int currentHours = scanner.nextInt();
        int contestBeginFor = scanner.nextInt();

        System.out.println((currentHours + contestBeginFor) % 24);
    }

    public static void main(String[] args) {
        RemainingTime clazz = new RemainingTime();
        clazz.main();
    }

}
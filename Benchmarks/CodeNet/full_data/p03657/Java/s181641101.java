import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputA = sc.nextInt();
        int inputB = sc.nextInt();

        if (((inputA + inputB) % 3) == 0) {
            System.out.printf("Possible");
        } else {
            System.out.printf("Impossible");
        }
    }
}

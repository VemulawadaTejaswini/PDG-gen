import java.util.*;

public class Main {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        // check
        int count = 0;

        if (A >= 6 && A <= 12) {
            count = B / 2;
        } else if (A <= 5) {
            count = 0;
        } else {
            count = B;
        }


        System.out.println(count);

//        System.out.println(System.currentTimeMillis() - startTime);
    }


}

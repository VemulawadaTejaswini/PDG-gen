import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();

        int even = K / 2;
        int odd = (K+1) / 2;

        System.out.println(even * odd);


    }
}

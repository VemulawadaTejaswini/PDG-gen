import java.util.Scanner;

public class Main {

    private static final Scanner  SC = new Scanner(System.in);
    private static final int N = SC.nextInt();
    private static final int K = SC.nextInt();

    public static void main(String[] args) {
        System.out.println(N-(K-1));
    }
}
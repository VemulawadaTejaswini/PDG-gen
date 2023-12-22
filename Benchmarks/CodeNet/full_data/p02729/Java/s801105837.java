import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int M = stdIn.nextInt();
        stdIn.close();

        int Count = ((N * (N - 1)) + (M * (M - 1))) / 2;

        System.out.println(Count);
    }
}
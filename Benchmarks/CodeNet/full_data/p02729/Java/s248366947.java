import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        scanner.close();

        int a = N*(N-1)/2;
        int b = M*(M-1)/2;
        System.out.println(a+b);
    }
}
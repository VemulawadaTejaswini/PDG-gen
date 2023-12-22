import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static int[] a;

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        a = new int[N];
        for(int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();
    }
    
    
    public static void main(String args[]) {
        init();
        // logic
    }
}
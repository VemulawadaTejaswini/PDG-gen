import java.util.Scanner;

public class Main {
    private static final long MODVAL = 1000000007L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar[] = { 1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51, };
        int K = sc.nextInt();
        System.out.println(ar[K-1]);
    }
}

import java.util.*;

public class Main {

    private int A;
    private int B;

    public Main() {
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
    }

    public void run() {
        int max = A + B;
        if (A - B > max) {
            max = A - B;
        }
        if (A * B > max) {
            max = A * B;
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        (new Main()).run();
    }

}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());

        if ((A < C && C < B) || (B < C && C < A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

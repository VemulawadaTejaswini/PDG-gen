import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();


        if (A == B && B == C) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
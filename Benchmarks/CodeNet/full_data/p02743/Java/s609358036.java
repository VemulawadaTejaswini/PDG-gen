import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int AS = A * A * B * C;
        int BS = A * B * B * C;
        int CS = A * B * C * C;
        if ((AS + BS) < CS) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
import java.util.Scanner;

//4AB< (C-A-B)^2

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int fAB = 4*A*B;
        int CAB = C-A-B;
        if (CAB < 1 || CAB * CAB <= fAB) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
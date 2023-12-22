import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int cap = A - B;
        
        if (cap > 0) {
            if ((C - cap >= 0)) {
                System.out.println(C - cap);
            } else {
                System.out.println(0);
            }
        } else {
            System.out.println(C);
        }
    }
}
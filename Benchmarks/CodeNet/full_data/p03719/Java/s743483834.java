import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        
        if(A <= C && B >= C) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

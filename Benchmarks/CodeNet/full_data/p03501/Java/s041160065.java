import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int N = scanner.nextInt();
       int A = scanner.nextInt();
       int B = scanner.nextInt();

       if (A*N < B) {
           System.out.println(A*N);
       } else {
           System.out.println(B);
       }
    }

}
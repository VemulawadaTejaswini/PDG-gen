import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i=1; i<= 9; i++) {
            for (int k=1; k<= 9; k++) {
                if (N == (i*k)) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }

}
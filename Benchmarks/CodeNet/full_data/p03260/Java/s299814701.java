import java.util.Scanner;

public class Main {
    static int A;
    static int B;
    static int[] a;

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        A = scanner.nextInt();
        B = scanner.nextInt();
        scanner.close();
    }


    public static void main(String args[]) {
        init();

        boolean isExists = false;
        for(int c = 1; c <= 3; c++) {
            if(A * B * c % 2 == 1) isExists = true; break;
        }

        if(isExists) System.out.println("Yes");
        else System.out.println("No");
    }
}

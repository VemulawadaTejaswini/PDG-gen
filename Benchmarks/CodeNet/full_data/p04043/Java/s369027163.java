import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if((A == 5 || A == 7) && (B == 5 || B == 7)  && (C == 5 || C == 7) && A + B + C == 17)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int badNum = 0;

        if (A != B) {
            badNum++;
        }
        if (B != C) {
            badNum++;
        }

        if (badNum == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
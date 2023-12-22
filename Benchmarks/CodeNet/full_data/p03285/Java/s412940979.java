
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();

        int work1 = n % 7;
        int work2 = n % 4;
        int work3 = n % 11;
        int work4 = n % 7 % 4;

        if (work1 == 0 || work2 == 0 || work3 == 0 || work4 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
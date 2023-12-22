import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();

        int c = 0;
        int count = 0;
        while (c < n) {
            c += 2 * d + 1;
            count++;
        }

        System.out.println(count);
    }

}

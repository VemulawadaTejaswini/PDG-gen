import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();

        int sec;
        if (c >= b) {
            sec = 0;
        } else {
            if (d <= b) {
                sec = d - c;
            } else {
                sec = b - c;
            }
        }
        System.out.println(sec);
    }
}

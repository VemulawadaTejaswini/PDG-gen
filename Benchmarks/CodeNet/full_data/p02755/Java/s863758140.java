import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 0 ; i <= 100 ; i++) {
            if (i * 8 / 100 == a && i * 10 / 100 == b) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }


}

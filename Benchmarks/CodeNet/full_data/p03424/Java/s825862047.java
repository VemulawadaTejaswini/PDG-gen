import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            if (str.equals("Y")) {
                System.out.println("Four");
                sc.close();
                return;
            }
        }

        System.out.println("Three");
        sc.close();
    }

}

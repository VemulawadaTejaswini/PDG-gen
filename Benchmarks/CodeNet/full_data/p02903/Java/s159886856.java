import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if ((i < b && j < a) || (i >= b && j >= a)) {
                    System.out.print("1");
                } else {
                    System.out.print("0");

                }
            }
            System.out.println();
        }

        sc.close();
    }

}

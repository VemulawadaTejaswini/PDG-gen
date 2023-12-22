import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int str = scan.nextInt();
        int s2 = scan.nextInt();
        int a = 0;
        switch (str) {
            case 1:
                if (s2 == 2) {
                    a = 3;
                } else {
                    a = 2;
                }
                break;

            case 2:
                if (s2 == 1) {
                    a = 3;
                } else {
                    a = 1;
                }
                break;
            case 3:
                if (s2 == 1) {
                    a = 2;
                } else {
                    a = 1;
                }
                break;
        }

        System.out.println(a);
    }
}
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        Choise(A, B);
    }

    private static void Choise(int a, int b) {
        if (a >= 1 && a <= 3 && b >= 1 && b <= 3) {
            if (a != b) {
                if (a == 1) {
                    if (b == 2) {
                        System.out.println(3);
                        return;
                    } else {
                        System.out.println(2);
                        return;
                    }
                }
                if (a == 2) {
                    if (b == 1) {
                        System.out.println(3);
                        return;
                    } else {
                        System.out.println(1);
                        return;
                    }
                }
                if (a == 3) {
                    if (b == 2) {
                        System.out.println(1);
                        return;
                    } else {
                        System.out.println(2);
                        return;
                    }
                }
            }
        }
    }
}

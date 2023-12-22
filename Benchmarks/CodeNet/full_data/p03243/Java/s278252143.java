import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        for (int i = 0; i <= 9; ++i) {
            if (N <= 111 * i) {
                System.out.print(111 * i);
                break;
            }
        }
    }
}
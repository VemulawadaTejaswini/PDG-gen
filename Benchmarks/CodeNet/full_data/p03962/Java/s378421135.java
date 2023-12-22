import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && a == c) {
            System.out.println(1);
        } else if (a == b || b == c || c == a) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }
}

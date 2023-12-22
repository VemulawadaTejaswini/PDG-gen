import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        String op = sc.next();
        int B = sc.nextInt();
        System.out.println(op.equals("+") ? A + B : A - B);
    }
}

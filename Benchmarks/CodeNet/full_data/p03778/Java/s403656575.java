import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (Math.abs(b - a) <= W) {
            System.out.println(0);
        } else {
            System.out.println(Math.min(Math.abs(b - a - W), Math.abs(a - b - W)));
        }
    }
}
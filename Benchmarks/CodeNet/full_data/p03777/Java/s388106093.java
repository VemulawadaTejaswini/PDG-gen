import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        if (sc.next().equals("H") ^ sc.next().equals("H")) {
            System.out.println("D");
        } else {
            System.out.println("H");
        }
    }
}
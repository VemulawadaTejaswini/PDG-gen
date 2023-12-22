import java.util.*;

public class Main {

    private int A;
    private int B;
    private int C;
    private int D;

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
    }

    public void printAnswer() {
        int num1 = Math.min(A, B);
        int num2 = Math.min(C, D);
        System.out.println(num1 + num2);
    }

    public void run() {
        inputData();
        printAnswer();
    }

    public static void main(String[] args) {
        (new Main()).run();
    }

}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int rest = A - B;
        int answer = C - rest;
        if (answer < 0) {
            System.out.println(0);
        } else {
            System.out.println(answer);
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int answer = B / A;
        if (B % A == 0) {
            System.out.println(answer);
        } else {
            System.out.println(answer + 1);
        }
    }
}

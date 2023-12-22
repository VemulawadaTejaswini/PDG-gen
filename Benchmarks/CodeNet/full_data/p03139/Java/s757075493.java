import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int maxNum = Math.min(A, B);
        int minNum = (A + B) > N ? (A + B - N) : 0;

        System.out.println(maxNum + " " + minNum);
    }
}

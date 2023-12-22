import java.util.Scanner;

public class Main {

    static int D;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        D = sc.nextInt();
        N = sc.nextInt();

        System.out.println((int)(N * Math.pow(100, D)));

    }
}

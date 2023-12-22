import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        System.out.println(problem157a(n));
    }

    private static int problem157a(int n) {
        return (n / 2) + (n % 2);
    }
}
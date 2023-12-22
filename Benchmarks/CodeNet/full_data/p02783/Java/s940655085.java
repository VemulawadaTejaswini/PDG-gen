import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Scanner sc = new Scanner(System.in);
        int H = Integer.parseInt(sc.next());
        int A = Integer.parseInt(sc.next());
        int remainder = H % A;
        int n = H / A;
        System.out.println(remainder > 0 ? n + 1 : n);
    }
}

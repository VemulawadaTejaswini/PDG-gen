import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int x = (int) (n / 1.08);

        if ((int) (x * 1.08) == n) {
            System.out.println(x);
        } else {
            System.out.println(":(");
        }
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        if (h % a == 0) {
            System.out.println(h / a);
        } else {
            System.out.println(h / a + 1);
        }
    }
}

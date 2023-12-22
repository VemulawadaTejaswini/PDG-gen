import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = Integer.parseInt(sc.next());

        double ans = (l / 3) * (l / 3) * (l / 3);
        System.out.println(ans);

        sc.close();
    }
}
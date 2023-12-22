import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c, d, e, k;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        k = sc.nextInt();

        if(e - d <= k && e - c <= k && e - b <= k && e - a <= k && d - c <= k && d - b <= k && d - a <= k && c - b <= k && c - a <= k && b - a <= k)
            System.out.println("Yay!");
        else
            System.out.println(":(");
    }
}

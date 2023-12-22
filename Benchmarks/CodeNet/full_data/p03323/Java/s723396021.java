import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = 16;
        String result = ":(";
        int a, b;
        String[] cake = new String[length];
        a = sc.nextInt();
        b = sc.nextInt();
        if (!(a >= 9 || b >= 9)) result = "yay!";
        System.out.println(result);
    }
}

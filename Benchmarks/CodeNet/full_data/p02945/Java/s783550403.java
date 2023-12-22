import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int plus = a + b;
        int minus = a - b;
        int multiple = a * b;

        System.out.println(Math.max(plus,Math.max(minus,multiple)));
    }
}
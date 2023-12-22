import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();

        System.out.println(String.valueOf(calculation(a, b, h)));

    }

    public static int calculation(int a, int b, int h) {
        return (a + b) * h / 2;
    }


}
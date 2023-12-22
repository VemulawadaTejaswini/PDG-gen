import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int t = sc.nextInt();

        int biscuitNum = biscuitNum(a, b, t);
        System.out.println(biscuitNum);
    }

    public static int biscuitNum(int a, int b, int t) {
        return (t / a) * b;
    }
}

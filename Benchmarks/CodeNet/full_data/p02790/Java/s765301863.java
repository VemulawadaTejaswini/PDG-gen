import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String strA = "";
        String strB = "";
        for (int i = 0; i < b; i++) {
            strA += a;
        }
        for (int i = 0; i < a; i++) {
            strB += b;
        }
        System.out.println(a <= b ? strA : strB);
    }
}
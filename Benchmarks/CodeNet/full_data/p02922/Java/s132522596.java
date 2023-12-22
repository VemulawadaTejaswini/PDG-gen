import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int now = 1;
        int num = 0;

        while (now < b) {
            now = now - 1 + a;
            num ++;
        }
        System.out.println(num);

        sc.close();
    }
}
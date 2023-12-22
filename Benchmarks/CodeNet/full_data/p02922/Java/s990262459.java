import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int count = 0;
        int sockets = 1;
        for (int i = 1; i < b; i+=a) {
            i--;
            count++;
        }

        System.out.println(count);
    }
}
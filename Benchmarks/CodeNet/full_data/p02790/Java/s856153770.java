import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b < a) {
            int t = b;
            b = a;
            a = t;
        }
        for (int i = 0; i < b; i++) {
            System.out.print(a);
        }
        sc.close();

    }

}

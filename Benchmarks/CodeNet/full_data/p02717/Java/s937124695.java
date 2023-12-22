import java.lang.reflect.Array;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int tmp = a;
        a = b;
        b = tmp;
        tmp = a;
        a = c;
        c = tmp;

        System.out.println(a+" "+b+" "+c);
    }

}

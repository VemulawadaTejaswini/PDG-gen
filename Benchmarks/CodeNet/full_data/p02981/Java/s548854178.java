
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(num * a >= b) System.out.println(b);
        else System.out.println(num * a);
    }
}
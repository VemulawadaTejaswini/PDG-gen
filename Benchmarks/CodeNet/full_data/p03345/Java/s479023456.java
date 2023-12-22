import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), k = in.nextInt();
        if(k%2 == 0) {
            System.out.println(a - b);
        } else {
            System.out.println(b - a);
        }
    }
}   
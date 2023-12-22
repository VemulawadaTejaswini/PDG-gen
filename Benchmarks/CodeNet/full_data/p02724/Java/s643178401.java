import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int x = in.nextInt();
        int z,y,a,m;
        z = x/500;
        y = z * 1000;
        z = z * 500;
        z = (x-z)/5;
        a = z * 5;
        m = a + y;
        System.out.println(m);
    }
}

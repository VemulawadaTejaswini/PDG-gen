
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();


        System.out.println(Math.max(n*m, Math.max(n +m , n - m)));

    }

}

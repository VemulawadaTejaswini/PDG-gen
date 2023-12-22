
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        long ans = x * (x - 1);
        ans /= 2;
        System.out.println(ans);

    }

}

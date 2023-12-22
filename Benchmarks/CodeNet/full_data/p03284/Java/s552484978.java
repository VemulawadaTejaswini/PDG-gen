import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        if(n % k == 0) {
            System.out.println(0);
        } else {
            System.out.println(n/k - n%k);
        }
    }
}
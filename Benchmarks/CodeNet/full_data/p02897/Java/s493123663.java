import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod = (int)1e9 + 7;
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(1);
        } else if (n % 2 == 0) {
            System.out.println(0.5);
        } else {
            System.out.println((n/2+1)/(double)n);
        }
    }

}

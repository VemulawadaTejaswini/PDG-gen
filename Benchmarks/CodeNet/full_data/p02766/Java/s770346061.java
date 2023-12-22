import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int count = 0;

        System.out.println(recursive(n,r,count));
    }

    public static int recursive(int n, int r, int count) {

        if (n / r == 0) {
            count++;
            return count;
        }

        else {
            count++;
            return recursive(n/r,r,count);
        }
    }


}

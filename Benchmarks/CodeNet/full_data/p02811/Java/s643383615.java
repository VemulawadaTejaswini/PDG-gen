import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int x = sc.nextInt();

        System.out.println(500 * k >= x ? "Yes" : "No");
    }
}
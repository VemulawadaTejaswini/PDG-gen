import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if ((x == 4 || x == 6 || x == 9 || x == 11) && (y == 4 || y == 6 || y == 9 || y == 11)) {
            System.out.println("Yes");
        } else if ((x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10) && (y == 3 || y == 5 || y == 7 || y == 8 || y == 10 || y == 12)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
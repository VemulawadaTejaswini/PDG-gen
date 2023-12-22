import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        int isLast = m1 != m2 ? 1 : 0;
        System.out.println(isLast);
    }
}

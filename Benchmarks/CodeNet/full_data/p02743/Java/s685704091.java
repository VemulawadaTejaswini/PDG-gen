import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (4*a*b < (c-a-b)*(c-a-b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}

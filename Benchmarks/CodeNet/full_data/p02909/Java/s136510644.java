import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod = (int)1e9 + 7;
        String a = sc.next();
        if (a.equals("Sunny")) {
            System.out.println("Cloudy");
        } else if (a.equals("Cloudy")) {
            System.out.println("Rainy");
        } else {
            System.out.println("Sunny");
        }
    }

}

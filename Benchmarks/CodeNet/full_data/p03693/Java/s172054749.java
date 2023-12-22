import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String r = sc.next();
        String g = sc.next();
        String b = sc.next();
        int integer = Integer.parseInt(r+g+b);

        String result = "NO";
        if (integer % 4 == 0) result = "YES";
        System.out.println(result);
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String concat = sc.next() + sc.next();
        long result = Math.round(Math.sqrt(Integer.parseInt(concat)));
        if (result * result == Integer.parseInt(concat)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

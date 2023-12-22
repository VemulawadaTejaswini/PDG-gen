import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String n = sc.next();

        String result = "No";
        if (n.charAt(0) == n.charAt(2)) result = "Yes";

        System.out.println(result);
    }
}

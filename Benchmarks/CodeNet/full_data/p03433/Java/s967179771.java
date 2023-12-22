import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        // int b = sc.nextInt();
        
        String result = "No";
        if ((n%500) <= a) result = "Yes";

        System.out.println(result);
        System.out.println(37%514);
    }
}

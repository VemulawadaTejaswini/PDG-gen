import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int t = sc.nextInt();
        
        String result = "No";
        if (k*500 >= t) result = "Yes";
        System.out.println(result);
    }
}

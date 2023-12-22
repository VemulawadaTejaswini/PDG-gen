import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String result = "Impossible";
        if ((a+b) % 3 == 0) result = "Possible";
        
        System.out.println(result);
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int r = sc.nextInt();
        int g = sc.nextInt();
        
        int result = ((g - r)*2) + r;

        System.out.println(result);
    }
}

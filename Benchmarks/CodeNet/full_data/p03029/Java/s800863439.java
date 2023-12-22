import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int p = sc.nextInt();

        int total_p = a*3 + p;
        int result = total_p / 2;
        
        System.out.println(result);
    }
}

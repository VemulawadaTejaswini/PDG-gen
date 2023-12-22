import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int original = (int)(A / 0.08);
        
        if (B == (int)(original * 0.1)){
            System.out.println(original);
        }else {
            System.out.println(-1);
        }
    }
}

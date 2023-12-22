import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int original = (int)(A / 0.08);
        
        for (int i = 1; i <= 100; i++){
            if ((int)(i * 0.08) == A && (int)(i * 0.1) == B){
                System.out.println(i);
                return;
            }
        }
        
        System.out.println(-1);
    }
}

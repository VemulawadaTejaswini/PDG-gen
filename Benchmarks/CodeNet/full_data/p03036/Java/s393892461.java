import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int D = sc.nextInt();
        int x2000 = sc.nextInt();
        
        int[] x = new int[11];
        x[0] = x2000;
        
        for(int i = 1; i <= 10; i++){
            x[i] = r * x[i-1] - D;
            System.out.println(x[i]);
        }
    }
}

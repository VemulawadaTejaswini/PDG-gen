import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for(int i=0; i<m; i++){
            n -= sc.nextInt();
        }
        
        System.out.println(n>=0?n:-1);
    }
}
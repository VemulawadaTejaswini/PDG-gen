import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] v = new int[n];
        int [] c = new int[n];
        
        for(int i = 0; i<n; i++){
            v[i] = sc.nextInt();
        }
        
        for(int i = 0; i<n; i++){
            c[i] = sc.nextInt();
        }
        
        int x = 0;
        int y = 0;
        
        System.out.println(x-y);
        
    }
}

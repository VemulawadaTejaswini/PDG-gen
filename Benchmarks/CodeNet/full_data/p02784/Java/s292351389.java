import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++){
            h -= sc.nextInt();
        }
        
        System.out.println(h<=0?"Yes":"No");
    }
}
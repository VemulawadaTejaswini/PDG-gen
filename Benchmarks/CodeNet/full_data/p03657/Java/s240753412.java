import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        if((A + B) % 3 == 0 ){
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
        
        sc.close();
        
    }
}

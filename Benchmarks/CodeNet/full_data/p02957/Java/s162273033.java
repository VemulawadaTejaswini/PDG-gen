import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        long B = sc.nextInt();
        
        if((A + B) % 2 == 0){
            System.out.println((long)Math.sqrt((A + B)*(A + B)) / 2);
        }else{
            System.out.println("IMPOSSIBLE");
        }
        
        
    }
}
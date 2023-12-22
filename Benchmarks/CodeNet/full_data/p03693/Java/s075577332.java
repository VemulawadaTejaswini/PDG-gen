import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
       
        Scanner scan = new Scanner(System.in);
        
        String r = scan.next();
        String g = scan.next();
        String b = scan.next();
        
        int rgb = Integer.parseInt(r) * 100 + Integer.parseInt(g) * 10 + Integer.parseInt(b);
        
        if((rgb % 4) == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

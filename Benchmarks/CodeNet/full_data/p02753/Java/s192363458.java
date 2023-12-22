import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        
        String s = sn.nextLine();
        
        if(s.substring(0,1) != s.substring(1,2)
            || s.substring(1,2) != s.substring(2,3)) {
              System.out.print("Yes");  
              return;
        }
        
        System.out.print("No");
    }
}

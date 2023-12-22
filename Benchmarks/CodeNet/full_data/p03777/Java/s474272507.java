import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
        
        String result = "H";
        // if (a.equals("H") && b.equals("H")) result = "H";
        // if (a.equals("D") && b.equals("D")) result = "H";
        // if (a.equals("H") && b.equals("D")) result = "H";
        
        if (a.equals("D") && b.equals("H")) result = "D";
        
        System.out.println(result);
      
    }
}

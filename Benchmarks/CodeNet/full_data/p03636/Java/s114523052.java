import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
 
        String fast = str.substring(0,1);
        String end = str.substring(str.length() - 1);
        
        int count = str.length() - 2;
        
        String ans = fast + count + end;
        
        System.out.println(ans); 
        
    }
}
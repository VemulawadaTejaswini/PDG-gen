import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner scan = new Scanner(System.in);
        
        String word = scan.nextLine();
        
        int all = word.length();
        
        String Abb = word.substring(0 , 1) + (all - 2) + word.substring(all-1);
        
        System.out.println(Abb);
    }
    
}
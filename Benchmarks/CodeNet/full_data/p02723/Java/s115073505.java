import java.util.*;

public class Main {
    public static void main(String args[]) {
     
    Scanner sc = new Scanner(System.in);
    
    String s = sc.nextLine();
    if(util(s))
    System.out.println("Yes");
    else
    System.out.println("No");

        
    }
    static boolean util(String s){
        
        
        if( s.charAt(2)==s.charAt(3) &&s.charAt(4)==s.charAt(5))
        return true;
        else
        return false;
    }
}

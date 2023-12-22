import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double a = Integer.parseInt(sc.next());
        double b = Integer.parseInt(sc.next());
        double c = Integer.parseInt(sc.next());
        
        a = Math.sqrt(a);
        b = Math.sqrt(b);
        c = Math.sqrt(c);
        
        System.out.println((a+b<c)?"Yes":"No");
    }
}

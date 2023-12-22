import java.util.*;
import java.math.*;

class Main{
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        
        System.out.print(((c <= b && c >= a)||(c >= b && c <= a) ? "Yes":"No"));
        
    }
}

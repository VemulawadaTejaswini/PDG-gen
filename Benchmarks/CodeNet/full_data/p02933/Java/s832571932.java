import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        String s = input.next();
        
        if(a > 3200)
        {
            System.out.println(s);
            System.out.println("a="+a+" is not less than 3200, so we print s= "+s);
        }
        else if(a < 3200)
        {
            System.out.println("red");
            System.out.println("a="+a+" is less than 3200, so we print red");
            
        }
        
        
    }
    
}

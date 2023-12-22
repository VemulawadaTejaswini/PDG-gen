import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        String s1,s2,s3;
        
        Scanner input = new Scanner(System.in);
        
        s1 = input.next();
        s2 = input.next();
        s3 = input.next();
        
       String a = s1.toUpperCase();
       String b = s2.toUpperCase();
       String c = s3.toUpperCase();
        
       char x = a.charAt(0);
       char y = b.charAt(0);
       char z = c.charAt(0);
       
       
        System.out.print(x);
        System.out.print(y);
        System.out.print(z);
        
        
        
    }
}

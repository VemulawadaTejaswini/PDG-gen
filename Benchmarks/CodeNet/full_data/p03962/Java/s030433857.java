
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if(a!=b && a!=c && b!=c)
            System.out.println(3);
        else if(a==b && a!=c && b!=c)
            System.out.println(2);
        else if(a!=b && a==c && b!=c)
            System.out.println(2);
        else if(a!=b && a!=c && b==c)
            System.out.println(2);
        else if(a==b && a==c && b==c)
            System.out.println(1);
        
        
    }
    
}

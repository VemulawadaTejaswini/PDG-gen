import java.util.Scanner;
import java.lang.Math;

public class Main{

    public static void main(String []args){
        
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        int c = Integer.parseInt(a+b);
        
        if (Math.sqrt(c)%1 == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}